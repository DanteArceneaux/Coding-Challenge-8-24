package streams;

public class Movie {
    private String title;
    private int likes;

    public Movie(String title, int likes) {
        this.title = title;
        this.likes = likes;
    }


    public int getLikes() {
        return likes;
    }

    public Movie setLikes(int likes) {
        this.likes = likes;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Movie setTitle(String title) {
        this.title = title;
        return this;
    }
}
