package hust.soict.hedspi.aims.order;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.MyDate;

import java.lang.Math;
import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	public static final int MAX_LIMITED_ORDERS = 5;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	private MyDate dateOrdered; 
	private int luckyItem;
	
	public Order(){
		LocalDate currentdate = LocalDate.now();
		int day = currentdate.getDayOfMonth();
		int month = currentdate.getMonthValue();
		int year = currentdate.getYear();	
		dateOrdered = new MyDate(day,month,year); 
    }
	
	public void addMedia(Media item) {
		if (searchById(item.getId()) != null) {
			System.out.println("Id already exits!!!");
			return;
		}
		else if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
			System.out.println("The order is almost full! Can not add the item \"" + 
					item.getTitle() + "\" !");
			return;
		}
		itemsOrdered.add(item);
		System.out.println("The item \"" + item.getTitle() + "\" has been added.");
	}
	
	public void addMedia (ArrayList<Media> items){
		for (int i = 0; i < items.size(); i++)
			addMedia(items.get(i));
	}
	
	public void removeMedia(Media item) {
		if (itemsOrdered.size() == 0) {
			System.out.println("Empty order! Nothing to remove!");
			return;
		}
		if (itemsOrdered.remove(item))
			System.out.println("The item \"" + item.getTitle() + "\" has been removed.");
		else
			System.out.println("Can not find the item \"" + item.getTitle() + "\" in the order! Can not remove!");
	}
	
	public void removeMedia(int id) {
		if (itemsOrdered.size() == 0) {
			System.out.println("Empty order! Nothing to remove!");
			return;
		}
		else {
			itemsOrdered.removeIf(o->o.getId() == id);
			System.out.println("The item \"" + itemsOrdered.get(id).getTitle() + "\" with id " + id + " has been removed.");
		}
	}
	
	public float totalCost() {
		float total = 0;
		for (int i = 0; i < itemsOrdered.size(); i++)
			total += itemsOrdered.get(i).getCost();
		if (itemsOrdered.size()>=2) {
			randomLuckyItem();
			total -= itemsOrdered.get(luckyItem).getCost();
		}
		return total;
	}
	
	public void printInfo(){
    	System.out.println("*********************************Order*********************************");
		System.out.println("Date: " + dateOrdered.print());
		System.out.println("Ordered Items:");
		for (int i = 0; i < itemsOrdered.size(); i++)
			System.out.println(i+1 + "." + itemsOrdered.get(i).toString());
		System.out.println("***********************************************************************");
		System.out.println("Total cost: " + totalCost() + "$");
        if (itemsOrdered.size()>=2)
			System.out.println("Lucky item for free: " + itemsOrdered.get(luckyItem).getTitle());
	}
	
	public Media searchById(int id){
        Media media =  this.itemsOrdered.stream().filter(o->o.getId()==id).findFirst().orElse(null);
        return media;
    }
	
	public void randomLuckyItem() {
        int range = itemsOrdered.size();
        this.luckyItem = (int) (Math.random() * range);
    }
}