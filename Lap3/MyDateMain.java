package Lap3;

public class MyDateMain {
	public static void main(String[] agr) {
		Mydate time = new Mydate("February/13th/2021");
		time.print();
		time = new Mydate(3,24,2000);
		time.print();
		time = new Mydate();
		time.print();
		time.accept();
		time.print();
	}
}