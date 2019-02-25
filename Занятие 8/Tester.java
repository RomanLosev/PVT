package core1;

public class Tester {

	public String name;
	public String surname;
	protected int experienceInYears;
	int englishLevel;
	private int salary;
	public int age;
	
	Tester(){};

	Tester(String name, String surname) {
		this.name = name;
		this.surname = surname;

	}

	Tester(String name, String surname, int experienceInYears, int englishLevel) {
		this(name, surname);
		this.experienceInYears = experienceInYears;
		this.englishLevel = englishLevel;

	}

	public Tester(String name, String surname, int experienceInYears, int englishLevel, int salary) {
		this(name, surname, experienceInYears, englishLevel);
		this.salary = salary;

	}

	private Tester(String name, String surname, int age) {
		this(name, surname);
		this.age = age;

	}

	void setName(String name) {
		this.name = name;
	}

	void setSurname(String surname) {
		this.surname = surname;
	}

	void setExperienceInYears(int experienceInYears) {
		this.experienceInYears = experienceInYears;
	}

	void setEnglishLevel(int englishLevel) {
		this.englishLevel = englishLevel;
	}

	void setSalary(int salary) {
		this.salary = salary;
	}
	
	void setAge(int age) {
		this.age = age;
	}

	String getName() {
		return this.name;
	}

	String getSurname() {
		return this.surname;
	}

	int getExperienceInYears() {
		return this.experienceInYears;
	}

	int getEnglishLevel() {
		return this.englishLevel;
	}

	int getSalary() {
		return this.salary;
	}
	
	int getAge() {
		return this.age;
	}
	

	private int getDoubleSalary() {
		return this.salary * 2;
	}

	int getExperienceInMonths() {
		return this.experienceInYears * 12;
	}

	protected void printNameSurname() {
		System.out.println(getName() + " " + getSurname());

	}

	public void printAllInformation() {
		System.out.println("Name: " + getName() + "; Surname: " + getSurname() + "; ExperienceInYears: "
				+ getExperienceInYears() + "; EnglishLevel: " + getEnglishLevel() + "; Salary: " + getSalary());

	}

}
