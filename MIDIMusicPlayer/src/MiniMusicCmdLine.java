import javax.sound.midi.*;
// Location: MIDIMusicPlayer/out/production/MIDIMusicPlayer
// Command: java MiniMusicCmdLine x y  (where x & y are two integers)
// Params: x & y: instument/note -- range: 0-127, from low to higher notes;
// Bug / Reset: CTRL + C is currently needed to reset the music player
// Result: specified note played from instrument through speakers

public class MiniMusicCmdLine {

    public static void main(String[] args) {

        MiniMusicCmdLine mini = new MiniMusicCmdLine();
//        Ensure proper # of args are passed
        if (args.length < 2) {
            System.out.println("Don't forget the instrument and note " +
                    "args!");
        } else {
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);
            mini.play(instrument, note);
        }
    }

    public void play(int instrument, int note) {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            MidiEvent event = null;

            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, instrument, 0);
            MidiEvent changeInstrument = new MidiEvent(first, 1);
            track.add(changeInstrument);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, note, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            a.setMessage(128, 1, note, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            player.setSequence(seq);
            player.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
