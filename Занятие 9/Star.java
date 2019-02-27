package Pañê2;

public class Star extends StarSystem {

	String starName;

	int starMass;

	Star() {
	};

	Star(String starName, int starMass) {
		this.starName = starName;
		this.starMass = starMass;
	}

	public void getInfo() {

		System.out.println("Star Name is " + this.starName + " StarMass: " + this.starMass);

	};

	public void printStarName() {
		System.out.println("Star Name is " + this.starName);
	};

	public void printStarMass() {
		System.out.println("StarMass: " + this.starMass);
	};

}
