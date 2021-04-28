package hust.soict.hedspi.aims.media;

public abstract class Media {

    private String title;
    private String category;
    private float cost;
    
    protected int id;

	public Media() {}
	
	public Media(int id, String title) {
		this.id = id;
		this.title = title;
	}
	
	public Media(int id, String title, String category) {
		this.id = id;
		this.title = title;
		this.category = category;
	}
	
	public Media(int id, String title, String category, float cost) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public void discount(int cost) {
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
	
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public int getId() {
		return id;
	}
	@Override
	public boolean equals(Object o){
        if (o instanceof Media) {
        	Media media = (Media)o;
            if (this.id == media.getId()) {
                return true;
            }
        }
        return false;
    }
	public static int stringCompare(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        int lmin = Math.min(l1, l2);
        for (int i = 0; i < lmin; i++) {
            int s1_ch = (int) s1.charAt(i);
            int s2_ch = (int) s2.charAt(i);
            if (s1_ch != s2_ch) {
                return s1_ch - s2_ch;
            }
        }
        if (l1 != l2) {
            return l1 - l2;
        }
        // If none of the above conditions is true,
        // it implies both the strings are equal
        else {
            return 0;
        }
    }
	
	public int compareTo(Media media) {
		if(media instanceof Media) {
			this.stringCompare(media.getTitle(),this.getTitle());
		}
		
		return 1;
	}
}