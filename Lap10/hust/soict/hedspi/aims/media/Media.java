package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public abstract class Media implements Comparable{
    private String title;
    private String category;
    private float cost;
    private int id;

    public Media(){};


    public Media(int id, String title){
        this.id = id;
        this.title = title;
    }
    public Media(int id,String title,String category){
        this.id = id;
        this.title = title;
        this.category = category;
    }
    public Media(int id,String title,String category,float cost){
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object e) throws NullPointerException, ClassCastException{
        if(e != null){
            if(e instanceof Media){
                if(this.getTitle().equalsIgnoreCase( ((Media)e).getTitle() )
                		&& this.getCost() == ((Media)e).getCost())
                    return true;
                return false;
            }else 
            {
                throw new ClassCastException("ERROR: Object casting");
            }
        }else
        {
            throw new NullPointerException("ERROR: Null pointerexception");
        }
    }

    public int compareTo(Object e) throws NullPointerException, ClassCastException{
        
        if(e!=null){
            if(e instanceof Media){
                return this.title.compareTo(((Media) e).getTitle());
            }else
            {
                throw new ClassCastException("ERROR: Object casting");
            }
        }else
        {
            throw new NullPointerException("ERROR: Null pointerexception");
        }
    }
}