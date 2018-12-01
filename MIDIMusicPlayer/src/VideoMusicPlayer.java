import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
// import java.io.*;

public class VideoMusicPlayer {
    static JFrame frame = new JFrame("Fist & Only Music Video");
    static MyDrawPanel ml;

    public static void main(String[] args) {
        VideoMusicPlayer vmp = new VideoMusicPlayer();
        vmp.go();
    }

    public void setUPGui() {
        ml = new MyDrawPanel();
        frame.setContentPane(ml);
        frame.setBounds(30,30,300,300);
        frame.setVisible(true);
    }

    public void go() {
        setUPGui();
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            sequencer.addControllerEventListener(ml, new int[] {127});
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            int r = 0;
            for (int i = 5; i < 61; i += 4) {
                r = (int) ((Math.random() * 50) + 1);

                track.add(makeEvent(144, 1, r, 100, i));
                /*
                Serves as Event for Sequencer
                176 = ControllerEvent command;
                Velocity = 0, so inaudible;
                Same Tick as NOTE ON, so fires on when each note start
                */
                track.add(makeEvent(176, 1, 127, 0, i));
                track.add(makeEvent(128, 1, r, 100, i + 2));
            }
            sequencer.setSequence(seq);
            sequencer.start();
            sequencer.setTempoInBPM(220);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static MidiEvent makeEvent(int command, int channel, int note, int velocity, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(command, channel, note, velocity);
            event = new MidiEvent(a, tick);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return event;
    }

    class MyDrawPanel extends JPanel implements ControllerEventListener {
        boolean msg = false;

        public void controlChange(ShortMessage event) {
            msg = true;
            repaint();
        }

        public void paintComponent(Graphics g) {
            if (msg) {
                Graphics2D g2 = (Graphics2D) g;
                int r = (int) (Math.random() * 250);
                int gr = (int) (Math.random() * 250);
                int b = (int) (Math.random() * 250);

                g.setColor(new Color(r, gr, b));

                int ht = (int) ((Math.random() * 120) + 10);
                int width = (int) ((Math.random() * 120) + 10);
                int x = (int) ((Math.random() * 40) + 10);
                int y = (int) ((Math.random() * 40) + 10);

                g.fillRect(x, y, width, ht);
                msg = false;
            }
        }
    }
}
