package core;

import java.util.Scanner;

public class Task2_4 {

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

		System.out.print("Null elements:");
		int zeroCount = 0;

		for (int i = 0; i < mas.length; i++)

			if (mas[i] == 0)

				zeroCount++;

		System.out.println(zeroCount);

		if (zeroCount == 0) {
			System.out.println("No zero");
		}

	}
}
