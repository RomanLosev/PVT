package core;

import java.util.Scanner;

public class Task3_1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int a = in.nextInt();

		int b = in.nextInt();

		minNumber(a, b);

		System.out.println(minNumber(a, b));
	}

	public static int minNumber(int a, int b) {

		if (a > b) {

			return b;

		}

		else {

			return a;

		}

	}

}
