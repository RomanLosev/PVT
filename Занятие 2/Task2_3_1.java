package core;

import java.util.Scanner;

public class Task2_3_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int size = scanner.nextInt();
		double mas[] = new double[size];

		for (int i = 0; i < size; i++) {
			mas[i] = Math.random();

		}
		System.out.println("Inserted array elements:");

		for (int i = 0; i < size; i++) {
			System.out.println(mas[i]);
		}
		System.out.println();

		System.out.println("Multiply *2 every 3 elements 2d option:");

		double mas1[] = new double[size];

		for (int i = 2; i < mas.length; i += 3) {

			mas1[i] = (mas[i] * 2);

			mas[i] = mas1[i];

		}
		for (int i = 0; i < mas.length; i++) {

			System.out.println(mas[i]);
		}

	}
}
