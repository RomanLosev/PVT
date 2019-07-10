package core;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter some name: ");
		String name = scanner.nextLine();

		if (name.equals("Вячеслав")) {
			System.out.println("Привет, Вячеслав");
		} else {
			System.out.println("Нет такого имени");
		}
	}

}
