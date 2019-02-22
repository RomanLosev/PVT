package core;

import java.util.Scanner;

public class Task2_2 {

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

		System.out.print("Multiply elements:");
		int umn = 1;
		for (int i = 0; i < mas.length; i++)
			umn = umn * mas[i];

		{
			System.out.println(umn);
		}

	}
}
