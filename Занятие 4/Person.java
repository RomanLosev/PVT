package core;

public class Person {

	public String name;
	public String surname;
	public int age;
	public int phone;

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setAge(int Age) {
		this.age = Age;
	}

	public void setPhone(int Phone) {
		this.phone = Phone;
	}

	public String getName() {
		return this.name;
	}

	public String getSurname() {
		return this.surname;
	}

	public int getAge() {
		return this.age;
	}

	public int getPhone() {
		return this.phone;
	}

	public void printAllInformation() {
		System.out.println(
				"Name: " + getName() + " Surname: " + getSurname() + " Age: " + getAge() + " Phone: " + getPhone());
	}

	public void printName() {
		System.out.println("Name: " + getName() + " Surname: " + getSurname());

	}

	public static void isAdult(int age) {

		if (age > 18) {
			System.out.println("true");
		}

		else {

			System.out.println("false");
		}

	}

}
