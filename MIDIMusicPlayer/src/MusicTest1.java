import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest1 {
    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("It worked!");
        } catch(MidiUnavailableException ex) {
            System.out.println("Something 'exceptional' happened");
        }
    }

    public static void main(String[] args) {
        MusicTest1 test = new MusicTest1();
        test.play();
    }
}

