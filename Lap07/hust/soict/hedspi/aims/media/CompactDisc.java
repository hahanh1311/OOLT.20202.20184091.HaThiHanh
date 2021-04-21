package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {

    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();
    
    // constructor
    public CompactDisc(String title) {
        super(title);
    }

    public CompactDisc(String title, String category) {
        super(title, category);
    }
    
    public CompactDisc(String title, String category, String director) {
        super(title, category, director);
    }
    
    public CompactDisc(String title, String category, String director, float cost) {
        super(title, category, director, cost);
    }
    
    public CompactDisc(String title, String category, String director, float cost, String artist) {
        super(title, category, director, cost);
        this.artist = artist;
    }
    
    public CompactDisc(String title, String category, String director, float cost, String artist,
                       ArrayList<Track> tracks) {
        super(title, category, director, cost);
        this.artist = artist;
        this.tracks = tracks;
    }

    // getter
    public String getArtist() {
        return artist;
    }
    
    // addTrack()
    public boolean addTrack(Track newTrack) {
        // check if the input track is already in the list of tracks
        if (this.searchTrack(newTrack) != -1) {
            System.out.println("Track already exists in tracks list! Cannot add track.");
            return false;
        } else {
            this.tracks.add(newTrack);
            System.out.println("Track added!");
            return true;
        }
    }
    
    // removeTrack()
    public boolean removeTrack(Track oldTrack) {
        int indexOfOldTrack = this.searchTrack(oldTrack);
        
        // check if the input track is already in the list of tracks
        if (indexOfOldTrack == -1) {
            System.out.println("Track not found! Cannot remove track.");
            return false;
        } else {
            this.tracks.remove(indexOfOldTrack);
            System.out.println("Track removed!");
            return true;
        }
    }
    
    // search track by title and length
    public int searchTrack(Track cmpTrack) {
        for (int i = 0; i < this.tracks.size(); i++) {
            if (this.tracks.get(i).isEqualAll(cmpTrack)) {
                return i;
            }
        }
        
        return -1;
    }

    // calculate length of the CD, which is the sum of the lengths of all its tracks
    public int getLength() {
        int sumOfTrackLength = 0;
        
        for (Track track : this.tracks) {
            sumOfTrackLength += track.getLength();
        }
        
        return sumOfTrackLength;
    }
    
    // print()
    public void print() {
        System.out.printf("CD - %s - %s - %d min - %.2f$\n",
                this.getTitle(), this.getCategory(), this.getLength(), this.getCost());
    }
    
    // play()
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD length: " + this.getLength());
        for (Track track : this.tracks) {
            track.play();
        }
    }
    
}
