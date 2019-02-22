package core;

import java.util.Scanner;

public class Task3_2 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int a = in.nextInt();

		evenNumber(a);
	}

	public static void evenNumber(int a) {

		if (a % 2 == 0) {

			System.out.println("true");

		}

		else {

			System.out.println("false");

		}

	}

}
