package core1;

public class TesterMain2 {

	public static void main(String[] args) {

		Tester tester2 = new Tester("Roman", "Losev", 27); // �� ����� ������� ������ ������ Tester, �.�. �����������
															// ����� ����������� "private" � �������� ������
															// ������ ������
		Tester tester2 = new Tester();

		tester2.setName("Vladimir");
		tester2.setSurname("Ivanov");
		tester2.setAge(29);

		System.out.println(tester2.getName());
		System.out.println(tester2.getSurname());
		System.out.println(tester2.getAge());

	}

}
