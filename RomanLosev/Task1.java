package core;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int a = scanner.nextInt();

		if (a > 7) {
			System.out.println("Hello");
		}
	}

}