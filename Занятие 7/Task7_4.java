package core;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task7_4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ���������� �����: ");
		int n = scanner.nextInt();
		String[] mas = new String[n];

		int sizeMinCharVar = 0;
		int indexMinCharVar = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("������� ������ ����� " + (i + 1) + ": ");
			mas[i] = scanner.next();
			Set<String> set = new HashSet<String>(Arrays.asList(mas[i].split("")));
			if (set.size() < sizeMinCharVar) {
				System.out.println("����� - " + mas[i]);
				indexMinCharVar = i;
				sizeMinCharVar = set.size();
			}

			String wordMinCharVar = mas[0];
			for (String word : mas) {
				Set<String> set1 = new HashSet<String>(Arrays.asList(word.split("")));
				if (set.size() < sizeMinCharVar) {

					wordMinCharVar = word;
					sizeMinCharVar = set.size();
				}
			}
			System.out.println(wordMinCharVar);
		}

	}

}
