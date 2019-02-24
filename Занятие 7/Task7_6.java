package core;

import java.util.Scanner;

public class Task7_6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("¬ведите количество строк: ");
		int n = scanner.nextInt();
		String[] mas = new String[n];

		int wordCount = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("¬ведите строку номер " + (i + 1) + ": ");
			mas[i] = scanner.next();

			for (String word : mas) {

				int count = 0;
				for (i = 1; i < word.length(); i++) {
					if (word.toCharArray()[i] > word.toCharArray()[i - 1]) {
						count++;
					}
				}
				System.out.println("Word = " + word + ": count = " + count);
				if ((word.length() - 1 == count) && (word.length() > 1) && (wordCount == 0)) {
					System.out.println(word);
					wordCount++;
				}

			}
			if (wordCount == 0)
				System.out.println("NOT FOUND");
		}
	}
}
