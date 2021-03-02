package hello;

import java.util.Scanner;

public class equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		double nghiem;

		Scanner scanner = new Scanner(System.in);
		System.out.println("--Giải pt bậc nhất--");
		System.out.println("Nhập vào số a: ");
		a = scanner.nextInt();
		System.out.println("Nhập vào số b: ");
		b = scanner.nextInt();
		System.out.println("Phương trình bạn vừa nhập vào là: " + a + "x + " + b + " = 0.");

		nghiem = (double) -b / a;
		System.out.println("Phương trình có nghiệm x = " + nghiem + ".");
// Giai pt bac 2
		System.out.println("--Giải pt bậc 2--");

		System.out.print("Nhập hệ số bậc 2, a = ");
		a = scanner.nextInt();
		System.out.print("Nhập hệ số bậc 1, b = ");
		b = scanner.nextInt();
		System.out.print("Nhập hằng số tự do, c = ");
		c = scanner.nextInt();
		System.out.println("Phương trình bạn vừa nhập vào là: " + a + "x^2 + " + b + "x+ " + c + " = 0.");

		if (a == 0) {
			if (b == 0) {
				System.out.println("Phương trình vô nghiệm!");
			} else {
				System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
			}
			return;
		}

		float delta = b * b - 4 * a * c;
		float x1;
		float x2;

		if (delta > 0) {
			x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
			x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
			System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
		} else if (delta == 0) {
			x1 = (-b / (2 * a));
			System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
		} else {
			System.out.println("Phương trình vô nghiệm!");
		}

		// giải hệ pt
		double a1, b1, c1, a2, b2, c2;
		System.out.println("--Giải hpt bậc nhất--");
		System.out.println("Vao he so: a1, b1, c1 = ");
		a1 = scanner.nextDouble();
		b1 = scanner.nextDouble();
		c1 = scanner.nextDouble();
		System.out.println("--Het PT1. Moi ban Nhap PT2--");
		System.out.println("a2, b2, c2 = ");
		a2 = scanner.nextDouble();
		b2 = scanner.nextDouble();
		c2 = scanner.nextDouble();
		double b11 = b1 * a2;
		double c11 = c1 * a2;
		double b22 = b2 * a1;
		double c22 = c2 * a1;

		double y = (c22 - c11) / (b11 - b22);
		System.out.println("y = " + y);
		double x = (-c11 - b11 * y) / (a1 * a2);
		System.out.println("x = " + x);

		System.exit(0);

	}

}
