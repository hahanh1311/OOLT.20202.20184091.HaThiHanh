package hust.soict.hedspi.aims.media;

public abstract class Media {

    private String title;
    private String category;
    private float cost;
    
    // constructor
    public Media(String title) {
        this(title, "", 0);
    }
    
    public Media(String title, String category) {
        this(title, category, 0);
    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // getter
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }
    
    // print()
    public void print() {
        System.out.printf("Media - %s - %s - %.2f$\n", this.getTitle(), this.getCategory(),this.getCost());
    }

}