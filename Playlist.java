package homework7;

import java.util.ArrayList;
import java.util.Collections;

public class Playlist {
    private String playlistTitle;
    private ArrayList<Song> songs;

    public Playlist(String playlistTitle) {
        this.playlistTitle = playlistTitle;
        this.songs = new ArrayList<>();
    }

    public String getPlaylistTitle() {
        return playlistTitle;
    }

    public void setPlaylistTitle(String playlistTitle) {
        this.playlistTitle = playlistTitle;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(String songTitle) {
        songs.removeIf(song -> song.getSongName().equals(songTitle));
    }

    public void swapSongs(Song song1, Song song2) {
        int index1 = songs.indexOf(song1);
        int index2 = songs.indexOf(song2);
        if (index1 != -1 && index2 != -1) {
            Collections.swap(songs, index1, index2);
        }
    }

    public String getTotalDuration() {
        int totalMinutes = 0, totalSeconds = 0;
        for (Song song : songs) {
            String[] parts = song.getDuration().split(":");
            totalMinutes += Integer.parseInt(parts[0]);
            totalSeconds += Integer.parseInt(parts[1]);
        }
        totalMinutes += totalSeconds / 60;
        totalSeconds %= 60;
        return totalMinutes + " min, " + totalSeconds + " sec";
    }

    public void sortSongs() {
        Collections.sort(songs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(playlistTitle + " - " + getTotalDuration() + "\n");
        for (int i = 0; i < songs.size(); i++) {
            sb.append((i + 1) + ". " + songs.get(i) + "\n");
        }
        return sb.toString();
    }
}

