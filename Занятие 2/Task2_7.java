package core;

import java.util.Scanner;

public class Task2_7 {

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

		System.out.println("Reverse elements ");

		for (int i = 0; i < mas.length / 2; i++) {
			int tmp = mas[i];
			mas[i] = mas[mas.length - i - 1];
			mas[mas.length - i - 1] = tmp;
		}

		for (int i = 0; i < mas.length; i++)

		{
			System.out.println(mas[i]);
		}

	}
}
