package core;

public class PersonMain {

	public static void main(String[] args) {

		Person person = new Person();

		person.setName("Roman");
		person.setSurname("Losev");
		person.setAge(29);
		person.setPhone(6333197);

		System.out.println(
				person.getName() + " " + person.getSurname() + " " + person.getAge() + " " + person.getPhone());

		person.printAllInformation();
		person.printName();
		person.isAdult(5);

	}
}
