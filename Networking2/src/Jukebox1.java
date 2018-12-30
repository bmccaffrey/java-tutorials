import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Jukebox1 {

    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args) {
        new Jukebox1().go();
    }

    public void go() {
        getSongs();
        System.out.println("File Order: " + songList);

        Collections.sort(songList);
        System.out.println("Alphabetical Order: " + songList);
    }

    void getSongs() {
        try {
            File file = new File("SongListMore.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception ex) { ex.printStackTrace(); }
    }

    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");

        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }

    class Song implements Comparable<Song> {
        String title;
        String artist;
        String rating;
        String bpm;

        public Song(String title, String artist, String rating, String bpm) {
            this.title = title;
            this.artist = artist;
            this.rating = rating;
            this.bpm = bpm;
        }

        public int compareTo(Song s) {
            return title.compareTo(s.getTitle());
        }

        public String toString() {
            return this.title;
        }

        public String getTitle() {
            return title;
        }

        public String getArtist() {
            return artist;
        }

        public String getRating() {
            return rating;
        }

        public String getBpm() {
            return bpm;
        }
    }

}
