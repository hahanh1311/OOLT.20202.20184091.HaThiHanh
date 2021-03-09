package Lap02;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int row, col;
			do {
				System.out.println("Columns of array: ");
				col = sc.nextInt();
				System.out.println("Rows of array: ");
				row = sc.nextInt();
				if (col <= 0 || row <= 0)
					System.out.println("Error ...");
			} while (col <= 0 || row <= 0);
			int a[][] = new int[row][col];
			int b[][] = new int[row][col];
			int sum[][] = new int[row][col];
			// input A
			System.out.println("Input matrix a ");

			for (int i = 0; i < row; i++)
				for (int j = 0; j < col; j++) {
					System.out.println("a[" + i + "][" + j + "] = ");
					a[i][j] = sc.nextInt();
				}

			// input b
			System.out.println("Input matrix b ");

			for (int i = 0; i < row; i++)
				for (int j = 0; j < col; j++) {
					System.out.println("b[" + i + "][" + j + "] = ");
					b[i][j] = sc.nextInt();
					sum[i][j]=a[i][j]+b[i][j];
				}
			// out a
			System.out.println("Matrix a: \n ");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(a[i][j] + "\t");
				}

				System.out.println("\n");
			}

			// out b
			System.out.println("Matrix b: \n");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(b[i][j] + "\t");
				}
				System.out.println("\n");
			}

			// sum=a+b
			System.out.println("Matrix sum: \n");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(sum[i][j] + "\t");
				}
				System.out.println("\n");
			}
			
		}

	}

}
