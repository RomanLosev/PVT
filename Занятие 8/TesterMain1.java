package Paск2;

import core1.Tester;

public class TesterMain1 {

	public static void main(String[] args) {

		Tester tester1 = new Tester("Roman", "Losev", 5, 3, 5000);

		System.out.println(tester1.getName()); // не можем вызвать, т.к. имеет
		// модификатор доступа "default" и доступен только внутри пакета
		System.out.println(tester1.getSurname()); // не можем вызвать, т.к. имеет
		// модификатор доступа "default" и доступен только внутри пакета
		System.out.println(tester1.getExperienceInYears()); // не можем вызвать, т.к.
		// имеет модификатор доступа "default" и доступен только внутри пакета
		System.out.println(tester1.getEnglishLevel()); // не можем вызвать, т.к. имеет
		// модификатор доступа "default" и доступен только внутри пакета
		System.out.println(tester1.getSalary()); // не можем вызвать, т.к. имеет
		// модификатор доступа "default" и доступен только внутри пакета
		System.out.println(tester1.getDoubleSalary()); // не можем вызвать, т.к. имеет модификатор доступа
		// "private" и доступен только внутри класса
		System.out.println(tester1.getExperienceInMonths()); // не можем вызвать, т.к.
		// имеет модификатор доступа "default" и доступен только внутри пакета
		tester1.printNameSurname(); // не можем вызвать, т.к. имеет модификатор доступа
		// "protected" и доступен в других пакетах только наследникам
		tester1.printAllInformation();

	}

}
