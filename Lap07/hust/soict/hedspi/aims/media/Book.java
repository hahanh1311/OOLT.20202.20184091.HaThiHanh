package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    
    private List<String> authors = new ArrayList<String>();
    
    // constructor
    public Book(String title) {
        super(title);
    }
    
    public Book(String title, String category) {
        super(title, category);
    }
    
    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }
    
    public Book(String title, String category, List<String> authors) {
        this(title, category, authors, 0);
    }
    
    public Book(String title, String category, List<String> authors, float cost) {
        super(title, category, cost);
        this.authors = this.checkAuthors(authors);
    }

    // getter & setter
    public List<String> getAuthors() {
        return this.authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
    
    // addAuthor()
    public void addAuthor(String authorName) {
        if (this.authors.contains(authorName)) {
            this.authors.add(authorName);
            System.out.println("Author " + authorName + " has been added to\"" + this.getTitle() + "\" 's Authors List!");
        } else {
            System.out.println("Cannot add author" + authorName + "to Authors List. " +
                    "Author's name already exists in \"" + this.getTitle() + "\" 's Authors List!");
        }
    }
    
    // removeAuthor()
    public void removeAuthor(String authorName) {
        if (this.authors.contains(authorName)) {
            this.authors.remove(authorName);
            System.out.println("Author " + authorName + " has been removed from \"" + this.getTitle() + "\" 's Authors List!");
        } else {
            System.out.println("Cannot remove author " + authorName + " from Authors List. " +
                    "Author's name does not exist in \"" + this.getTitle() + "\" 's Authors List!");
        }
    }
    
    public void print() {
        System.out.printf("Book - %s - ", this.getTitle());
        
        System.out.print(this.authors.get(0));
        for (int i = 1; i < this.authors.size(); i++) {
            System.out.print(", " + this.authors.get(i));
        }
        
        System.out.printf(" - %s - %.2f$\n", this.getCategory(),this.getCost());
        
    }
    
    // check authors list: no 2 same name
    public List<String> checkAuthors(List<String> inputtedAuthors) {
        List<String> authors = new ArrayList<String>();
        for (int i = 0; i < inputtedAuthors.size(); i++) {
            if (!authors.contains(inputtedAuthors.get(i))) {
                authors.add(inputtedAuthors.get(i));
            }
        }
        return authors;
    }
    
}