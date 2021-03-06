import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;

public class VideoMusicPlayer {
    static JFrame frame = new JFrame("Fist & Only Music Video");
    static MyDrawPanel panel;
    private int[] coordinates = new int[2];
    private int[] rgb = new int[3];
    private int[] heightAndWidth = new int[2];

    public static void main(String[] args) {
        VideoMusicPlayer vmp = new VideoMusicPlayer();
        vmp.start();
    }

    public void start() {
        setUpFrameAndPanel();
        initializeSequencer();
    }

    public void setUpFrameAndPanel() {
        createPanel();
        setFrameDefaults();
    }

    private void createPanel() {
        panel = new MyDrawPanel();
        frame.setContentPane(panel);
    }

    private void setFrameDefaults() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30, 30, 300, 300);
        frame.setVisible(true);
    }

    private void initializeSequencer() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addControllerEventListener(panel, new int[]{127});
            createAndSetSequence(sequencer);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        } catch(MidiUnavailableException | InvalidMidiDataException e) { e.printStackTrace(); }
    }

    private void createAndSetSequence(Sequencer sequencer) throws InvalidMidiDataException {
        Sequence sequence = createSequence();
        sequencer.setSequence(sequence);
    }

    private Sequence createSequence() throws InvalidMidiDataException {
        Sequence sequence = new Sequence(Sequence.PPQ, 4);
        Track track = sequence.createTrack();
        addRandomEventsToTrack(track);
        return sequence;
    }

    private void addRandomEventsToTrack(Track track) {
        int randomNote = 0;
        for (int i = 5; i < 160; i += 4) {
            randomNote = (int) ((Math.random() * 50) + 1);
            track.add(makeEvent(144, 1, randomNote, 100, i));
            track.add(makeEvent(176, 1, 127, 0, i));
            track.add(makeEvent(128, 1, randomNote, 100, i + 2));
        }
    }

    private static MidiEvent makeEvent(int command, int channel, int note, int velocity, int tick) {
        MidiEvent event = null;
        ShortMessage shortMessage = createMessage(command, channel, note, velocity);
        event = new MidiEvent(shortMessage, tick);
        return event;
    }

    private static ShortMessage createMessage(int command, int channel, int note, int velocity) {
        ShortMessage shortMessage = new ShortMessage();
        try { shortMessage.setMessage(command, channel, note, velocity); }
        catch (InvalidMidiDataException e) { e.printStackTrace(); }
        return shortMessage;
    }

    class MyDrawPanel extends JPanel implements ControllerEventListener {
        boolean message = false;
        public void controlChange(ShortMessage event) {
            message = true;
            repaint();
        }

        public void paintComponent(Graphics g) {
            if (message) {
                Graphics2D g2 = (Graphics2D) g;
                randomizeColorSizeAndCoordinates();
                Color randomColor = new Color(rgb[0], rgb[1], rgb[2]);
                g.setColor(randomColor);
                g.fillRect(coordinates[0], coordinates[1], heightAndWidth[0], heightAndWidth[1]);
                message = false;
            }
        }
    }

    private void randomizeColorSizeAndCoordinates() {
        randomizeValues(rgb, 256, 0);
        randomizeValues(heightAndWidth, 120, 10);
        randomizeValues(coordinates, 40, 60);
    }

    private void randomizeValues(int[] array, int upperBound, int offSet) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * upperBound) + offSet);
        }
    }
}
