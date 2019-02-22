package core;

import java.util.Scanner;

public class Task2_1 {

	public static void main(String[] args) {
		{

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

			System.out.println("Inserted array elements in direct order:");
			for (int i = 0; i < mas.length; i++) {
				System.out.println(mas[i]);

			}

			System.out.println("Inserted array elements in reverse order:");
			for (int i = mas.length - 1; i >= 0; i--) {

				System.out.println(mas[i]);
			}

		}
	}
}
