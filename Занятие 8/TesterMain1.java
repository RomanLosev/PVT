package Pa��2;

import core1.Tester;

public class TesterMain1 {

	public static void main(String[] args) {

		Tester tester1 = new Tester("Roman", "Losev", 5, 3, 5000);

		System.out.println(tester1.getName()); // �� ����� �������, �.�. �����
		// ����������� ������� "default" � �������� ������ ������ ������
		System.out.println(tester1.getSurname()); // �� ����� �������, �.�. �����
		// ����������� ������� "default" � �������� ������ ������ ������
		System.out.println(tester1.getExperienceInYears()); // �� ����� �������, �.�.
		// ����� ����������� ������� "default" � �������� ������ ������ ������
		System.out.println(tester1.getEnglishLevel()); // �� ����� �������, �.�. �����
		// ����������� ������� "default" � �������� ������ ������ ������
		System.out.println(tester1.getSalary()); // �� ����� �������, �.�. �����
		// ����������� ������� "default" � �������� ������ ������ ������
		System.out.println(tester1.getDoubleSalary()); // �� ����� �������, �.�. ����� ����������� �������
		// "private" � �������� ������ ������ ������
		System.out.println(tester1.getExperienceInMonths()); // �� ����� �������, �.�.
		// ����� ����������� ������� "default" � �������� ������ ������ ������
		tester1.printNameSurname(); // �� ����� �������, �.�. ����� ����������� �������
		// "protected" � �������� � ������ ������� ������ �����������
		tester1.printAllInformation();

	}

}
