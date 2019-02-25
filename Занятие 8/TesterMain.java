package core1;

public class TesterMain {

	public static void main(String[] args) {

		Tester tester = new Tester("Roman", "Losev", 5, 3);

		tester.setSalary(3000);

		System.out.println(tester.getName());
		System.out.println(tester.getSurname());
		System.out.println(tester.getExperienceInYears());
		System.out.println(tester.getEnglishLevel());
		System.out.println(tester.getSalary());
		System.out.println(tester.getDoubleSalary()); //не можем вызвать, т.к. имеет модификатор доступа
		// "private" и доступен только внутри класса
		System.out.println(tester.getExperienceInMonths());
		tester.printNameSurname();
		tester.printAllInformation();

	}

}
