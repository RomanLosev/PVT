package core;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		{

			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter array length: ");
			int size = scanner.nextInt();
			int mas[] = new int[size];
			System.out.println("Insert array elements:");

			for (int i = 0; i < size; i++) {
				mas[i] = scanner.nextInt();
			}
			System.out.print("Inserted array elements: ");

			for (int i = 0; i < size; i++) {
				System.out.print(mas[i] + " ");
			}
			System.out.println();

			System.out.print("Array elements multiples of 3: ");
			for (int i = 0; i < mas.length; i++) {
				if (mas[i] % 3 == 0)
					System.out.print(mas[i] + " ");
			}

		}

	}

}
