package Pañê2;

public abstract class StarSystem {

	String starSystemName;
	int starSystemAge;

	StarSystem() {
	};

	StarSystem(String starSystemName) {
		this.starSystemName = starSystemName;
	}

	StarSystem(String starSystemName, int starSystemAge) {
		this(starSystemName);
		this.starSystemAge = starSystemAge;
	}

	public abstract void getInfo();

	public void printStarSystemName() {
		System.out.println("Star System Name is " + this.starSystemName);
	};

	public void printStarSystemAge() {
		System.out.println("Star System Age: " + this.starSystemAge);
	};

}
