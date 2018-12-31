import javax.sound.midi.MidiEvent;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import java.awt.event.ActionListener;

public class BeatBoxFinal {

    Sequencer sequencer;
    Sequence sequence;
    Sequence mySequence = null;
    Track track;

    String[] instrumentNames = {"Bass Drum", "Closed Hi-Hat", "Open Hi-Hat", "Acoustic Snare", "Crash Cymbal", "Hand Clap", "High Tom", "Hi Bongo", "Maracas", "Whistle", "Low Conga", "Cowbell", "Vibraslap", "Low-mid Tom", "High Agogo", "Open Hi Conga"};
    int [] instruments = {35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63};

    public static void main(String[] args) {}
    public void startUp(String name) {}
    public void buildGUI() {}
    public void setUpMidi() {}
    public void buildTrackAndStart(){}


    public class MyStartListener implements ActionListener {
        public void actionPerformed(ActionEvent a) { buildTrackAndStart(); }
    }

    public class MyStopListener implements ActionListener {
        public void actionPerformed(ActionEvent a) { sequencer.stop(); }
    }
    
    public class MyUpTempoListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor((float) (tempoFactor * 1.03));
        }
    }

    public class MyDownTempoListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor((float) (tempoFactor * .97));
        }
    }

    public class MySendListener implements ActionListener {}
    public class MyListSelectionListener implements ActionListener {}
    public class RemoteReader implements Runnable {}
    public class MyPlayMineListener implements ActionListener {}
    public void changeSequence() {}
    public void makeTracks() {}
    public MidiEvent makeEvent() {}
}
