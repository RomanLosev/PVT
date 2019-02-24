package core;

import java.util.Scanner;

public class Task7_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("¬ведите количество строк: ");
		int n = scanner.nextInt();

		String[] mas = new String[n];

		int indexMax = 0;
		int indexMin = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("¬ведите строку номер " + (i + 1) + ": ");
			mas[i] = scanner.next();
			if (mas[i].length() <= mas[indexMin].length())
				indexMin = i;
			if (mas[i].length() >= mas[indexMax].length())
				indexMax = i;
		}

		System.out.printf("MIN (%d): \"%s\"%n", mas[indexMin].length(), mas[indexMin]);
		System.out.printf("MAX (%d): \"%s\"%n", mas[indexMax].length(), mas[indexMax]);
	}

}
