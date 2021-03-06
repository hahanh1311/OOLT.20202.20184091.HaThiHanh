package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.exceptions.PlayerException;

public class Track implements Playable, Comparable{
    private String title;
    int length;

    public Track(String title) {
        this.title = title;
    }

    public Track(int length) {
        this.length = length;
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
    public void play() throws PlayerException {
        System.out.println(" Playing Track: " + this.getTitle());
        if(this.length >0){
            System.out.println(" DVD Track: " + this.getLength());
        } else{
            throw new PlayerException("ERROR: CD length is non-positive");
        }
    }
    public String getMessage() {
        return "\nPlaying Track: " + this.getTitle() + "\nTrack length: " + this.getLength();
    }
    @Override
    public boolean equals(Object e){
        if(e instanceof Track) {
            if(length == ((Track) e).getLength() && title.equals(((Track) e).title)){
                return true;
            }
            else
                return false;
        }
        else
            return false;
    }

    @Override
    public int compareTo(Object e) {
        return 0;
    }
}