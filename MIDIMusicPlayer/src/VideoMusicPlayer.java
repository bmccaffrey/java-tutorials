import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

public class VideoMusicPlayer {

    public static MidiEvent makeEvent(int command, int channel, int note, int velocity, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(command, channel, note, velocity);
            event = new MidiEvent(a, tick);
        } catch(Exception e) {e.printStackTrace();}
        return event;
    }
}
