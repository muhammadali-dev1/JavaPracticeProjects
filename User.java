package homework7;

import java.util.ArrayList;

public class User {
    private String username;
    private ArrayList<Playlist> playlists;

    public User(String username) {
        this.username = username;
        this.playlists = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void addPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }

    public void removePlaylist(String playlistTitle) {
        playlists.removeIf(playlist -> playlist.getPlaylistTitle().equals(playlistTitle));
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public Playlist getPlaylist(String playlistTitle) {
        return playlists.stream()
                .filter(playlist -> playlist.getPlaylistTitle().equals(playlistTitle))
                .findFirst()
                .orElse(null);
    }

    public void makeCollaborativePlaylist(String playlistTitle, User friend) {
        Playlist playlist = getPlaylist(playlistTitle);
        if (playlist != null) {
            friend.addPlaylist(playlist);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User: " + username + "\n");
        for (Playlist playlist : playlists) {
            sb.append(playlist + "\n");
        }
        return sb.toString();
    }
}
