package core;

import java.util.Scanner;

public class Task2_10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int size = scanner.nextInt();
		int mas[] = new int[size];
		System.out.println("Insert array elements:");

		for (int i = 0; i < size; i++) {
			mas[i] = scanner.nextInt();

		}
		System.out.println("Inserted array elements:");

		for (int i = 0; i < size; i++) {
			System.out.println(mas[i]);
		}
		System.out.println();

		boolean ascending = true;
		for (int i = 1; i < mas.length; i++) {
			if (mas[i] < mas[i - 1]) {
				ascending = false;
			}
		}

		System.out.println("Array is ascending: " + ascending);

	}
}
