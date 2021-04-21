package hust.soict.hedspi.aims.media;

public class Track implements Playable{
    
    private String title;
    private int length;
    
    // constructor
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    // getter
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
    
    // isEqualTittle()
    public boolean isEqualAll(Track aTrack) {
        if (this.title.equals(aTrack.getTitle())) {
            if (this.length == aTrack.length) {
                return true;
            }
        }
        return false;
    }
    
    // play()
    public void play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }

}