package homework7;

public class Testing {
    public static void main(String[] args) {
        // Create playlists and songs
        Playlist p0 = new Playlist("Study Songs");
        Song s1 = new Song("Studying1", "ABC", "3:00");
        Song s2 = new Song("Studying2", "XYZ", "4:50");
        Song s3 = new Song("Studying3", "CDE", "2:50");
        Song s4 = new Song("Studying4", "EFG", "3:25");

        p0.addSong(s1);
        p0.addSong(s3);
        p0.addSong(s4);

        Playlist p1 = new Playlist("Workout Songs");
        p1.addSong(new Song("Exercising1", "JKL", "3:00"));
        p1.addSong(new Song("Exercising2", "OPQRS", "2:50"));
        p1.addSong(new Song("Exercising3", "Wxyz", "4:35"));
        p1.addSong(new Song("Exercising3", "Stu", "3:25"));

        // Create users
        User u0 = new User("Paul");
        User u1 = new User("Mary");

        MusicService.addUser(u0);
        MusicService.addUser(u1);

        // Assign playlists to users
        u0.addPlaylist(p0);
        u1.addPlaylist(p1);

        // Display original playlists
        System.out.println("ORIGINAL STUDY SONGS PLAYLIST BY USER Paul:");
        for (Playlist p : MusicService.getUserPlaylists(u0)) {
            System.out.println(p);
        }

        System.out.println("ORIGINAL WORKOUT SONGS PLAYLIST BY USER Mary:");
        for (Playlist p : MusicService.getUserPlaylists(u1)) {
            System.out.println(p);
        }

        // Make collaborative playlist and modify it
        u0.makeCollaborativePlaylist("Study Songs", u1);
        Playlist collabPlaylist = u1.getPlaylist("Study Songs");
        collabPlaylist.setPlaylistTitle("Study Songs with Mary");
        collabPlaylist.removeSong("Studying4");
        collabPlaylist.addSong(s2);
        collabPlaylist.swapSongs(s1, s2);

        System.out.println("\nUPDATED PLAYLISTS BY USER Mary:");
        for (Playlist p : MusicService.getUserPlaylists(u1)) {
            System.out.println(p);
        }

        // Sort both playlists and display them
        collabPlaylist.sortSongs();
        u1.getPlaylist("Workout Songs").sortSongs();

        System.out.println("\nAFTER SORTING BOTH PLAYLISTS:");
        for (Playlist p : MusicService.getUserPlaylists(u1)) {
            System.out.println(p);
        }
    }
}
