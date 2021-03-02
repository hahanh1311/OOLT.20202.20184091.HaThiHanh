package hello;

import java.util.Scanner;

public class calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Nhap so thu nhat: ");
		 num1= sc.nextInt();
		 
		 System.out.println("Nhap so thu hai: ");
		 num2= sc.nextInt();
		 int c= num1 + num2;
		 System.out.println(+num1+ "+"+ num2+ "="+ c );
		 c= num1 - num2;
		 System.out.println(+num1+ "-"+ num2+ "="+ c );
		 int tich = num1*num2;
		 System.out.println(+num1+ "*"+ num2+ "="+ tich);
		 float thuong= (float)num1/num2;
		 System.out.println(+num1+ ":"+ num2+ "="+  thuong);
		 System.exit(0);


	}

}
