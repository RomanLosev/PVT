package core;

import java.util.Scanner;

public class Task2_12 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int size = scanner.nextInt();
		int mas[] = new int[size];
		int mas1[] = new int[size];
		System.out.println("Insert array elements:");

		for (int i = 0; i < size; i++) {
			mas[i] = scanner.nextInt();

		}
		System.out.println("Inserted array elements:");

		for (int i = 0; i < size; i++) {
			System.out.println(mas[i]);
		}
		System.out.println();

		{System.out.println("New array:"); }
		for (int i = 0; i < mas.length - 2; i++) {

			mas1[i + 1] = mas[i];

			mas[i] = mas1[i];

		}

		for (int i = 0; i < mas.length; i++) {
			System.out.println(mas[i]);
		}

	}
}