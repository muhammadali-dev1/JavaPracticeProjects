package homework7;

import java.util.ArrayList;

public class MusicService {
    private static ArrayList<User> users = new ArrayList<>();

    public static void addUser(User user) {
        users.add(user);
    }

    public static void removeUser(User user) {
        users.remove(user);
    }

    public static ArrayList<Playlist> getUserPlaylists(User user) {
        return user.getPlaylists();
    }
}
