package core;

import java.util.Scanner;

public class Task7_5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("¬ведите количество строк: ");
		int n = scanner.nextInt();
		String[] mas = new String[n];

		int numWordsWithEqualLetters = 0;

		int countEngLetters = 0;
		int balance = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("¬ведите строку номер " + (i + 1) + ": ");
			mas[i] = scanner.next();
			{

				for (Character letter : mas[i].toCharArray()) {
					System.out.print(letter + " ");
					if (((letter >= 'A') && (letter <= 'Z')) || ((letter >= 'a') && (letter <= 'z'))) {
						countEngLetters++;
						if ((letter == 'A') || (letter == 'E') || (letter == 'I') || (letter == 'O') || (letter == 'U')
								|| (letter == 'Y') || (letter == 'a') || (letter == 'e') || (letter == 'i')
								|| (letter == 'o') || (letter == 'u') || (letter == 'y'))
							++balance;
						else
							--balance;
					}
				}
				if (countEngLetters == mas[i].length()) {
					System.out.println("english word");
					if (balance == 0) {
						++numWordsWithEqualLetters;
						System.out.println(mas[i] + " Word With Equal Letters!");
					}
				}

			}
			System.out.println(numWordsWithEqualLetters);
		}
	}
}
