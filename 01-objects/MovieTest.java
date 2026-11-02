public class MovieTest {
    public static void main (String[] args) {
        Movie one = new Movie();
        one.title = "Beast";
        one.genre = "action";
        one.rating = 6;
        Movie two = new Movie();
        two.rating = 8;
        two.genre = "Comedy";
        two.title = "Nanban";

        one.playingit();
        two.playingit();
    }
}

public class Movie {
    String title;
    String genre;
    int rating;
    void playingit() {
        System.out.println("Movie is Playing out");
    }
}

