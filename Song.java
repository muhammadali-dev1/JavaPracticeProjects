package homework7;

public class Song implements Comparable<Song> {
    private String songName;
    private String artistName;
    private String duration;

    public Song(String songName, String artistName, String duration) {
        this.songName = songName;
        this.artistName = artistName;
        this.duration = duration;
    }

    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getDuration() {
        return duration;
    }

    @Override
    public int compareTo(Song other) {
        int nameComparison = this.songName.compareTo(other.songName);
        if (nameComparison != 0) {
            return nameComparison;
        }
        return this.artistName.compareTo(other.artistName);
    }

    @Override
    public String toString() {
        return songName + " by " + artistName + " (" + duration + ")";
    }
}
