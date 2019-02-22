package core;

import java.util.Scanner;

public class Task2_9 {

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

		System.out.print("Number max element = ");
		int indexMax = 0;
		int max = mas[0];
		for (int i = 0; i < mas.length; i++)
			if (max < mas[i]) {
				max = mas[i];
				indexMax = i;
			}

		System.out.println(indexMax);

		System.out.print("Number min element = ");
		int indexMin = 0;
		int min = mas[0];
		for (int i = 0; i < mas.length; i++)

			if (min > mas[i]) {
				min = mas[i];
				indexMin = i;
			}

		System.out.print(indexMin);

	}
}
