package hust.soict.hedspi.aims.media;

import java.util.StringTokenizer;

public class DigitalVideoDisc extends Media{
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	public DigitalVideoDisc(int id, String title) {
		super(id, title);
	}
	
	public DigitalVideoDisc(int id, String title,String category) {
		super(id, title, category);
	}
	
	public DigitalVideoDisc(int id, String title,String category, float cost) {
		super(id, title, category, cost);
	}
	
	public DigitalVideoDisc(int id, String title, String category, String director, float cost) {
		super(id, title,category,cost);
		this.director = director;
	}
	
	public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
		this(id, title,category,director,cost);
		this.length = length;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof DigitalVideoDisc) {
			DigitalVideoDisc tmp = (DigitalVideoDisc)obj;
			
			if (this.title == null && tmp.title != null)
				return false;
			if (this.title != null) {
				if (tmp.title == null)
					return false;
				else if (this.title.equals(tmp.title) == false)
					return false;
			}
			return true;
		}
		return false;
	}
}

