package Pañê2;

public class Mars extends Planet {

	int marsDiametr;

	int marsVolume;

	Mars(String starSystemName) {
		this.starSystemName = starSystemName;
	}

	Mars(String starSystemName, int starSystemAge) {
		this.starSystemName = starSystemName;
		this.starSystemAge = starSystemAge;
	}

	public void printMarsDiametr() {
		System.out.println("Mars Diametr: " + this.marsDiametr);
	};

	public void printMarsVolume() {
		System.out.println("Mars Volume: " + this.marsVolume);
	};

}
