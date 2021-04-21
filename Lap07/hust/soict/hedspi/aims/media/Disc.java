package hust.soict.hedspi.aims.media;

public class Disc extends Media {

    private String director;
    private int length;
    
    // constructor
    public Disc(String title) {
        super(title);
    }

    public Disc(String title, String category) {
        super(title, category);
    }
    
    public Disc(String title, String category, String director) {
        this(title, category, director, 0, 0);
    }
    
    public Disc(String title, String category, String director, float cost) {
        this(title, category, director, cost, 0);
    }
    
    public Disc(String title, String category, String director, float cost, int length) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }

    // getter
    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

}
