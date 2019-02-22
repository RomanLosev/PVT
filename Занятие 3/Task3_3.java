package core;

import java.util.Scanner;

public class Task3_3 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int a = in.nextInt();

		multiply(a);

		System.out.println(multiply(a));
	}

	public static int multiply(int a) {

		int c;

		c = a * a;

		return c;

	}
}
