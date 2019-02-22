package core;

import java.util.Scanner;

public class Task3_4 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int a = in.nextInt();

		multiply1(a);

		System.out.println(multiply1(a));
	}

	public static int multiply1(int a) {

		int d;

		d = a * a * a;

		return d;

	}
}
