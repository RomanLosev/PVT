package core;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter some name: ");
		String name = scanner.nextLine();

		if (name.equals("Vyacheslav")) {
			System.out.println("Hello, Vyacheslav");
		} else {
			System.out.println("No such name");
		}
	}

}
