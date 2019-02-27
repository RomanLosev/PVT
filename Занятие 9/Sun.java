package Pañê2;

public class Sun extends Star {

	int sunDiametr;

	int sunVolume;

	Sun() {
	};

	Sun(int sunDiametr, int countCarlicPlanets) {
		this.sunDiametr = sunDiametr;
		this.sunVolume = sunVolume;
	}

	public void printSunDiametr() {
		System.out.println("Sun Diametr: " + this.sunDiametr);
	};

	public void printSunVolume() {
		System.out.println("Sun Volume: " + this.sunVolume);
	};

}
