package Pañê2;

public class Planet extends StarSystem {

	int countGigantPlanets;

	int countCarlicPlanets;

	Planet() {
	};

	Planet(int countGigantPlanets, int countCarlicPlanets) {
		this.countGigantPlanets = countGigantPlanets;
		this.countCarlicPlanets = countCarlicPlanets;
	}

	public void getInfo() {

		System.out.println("Count Gigant Planets: " + this.countGigantPlanets + " Count Carlic Planets: "
				+ this.countCarlicPlanets);

	};

	public void printCountGigantPlanets() {
		System.out.println("Count Gigant Planets: " + this.countGigantPlanets);
	};

	public void printCountCarlicPlanets() {
		System.out.println("Count Carlic Planets: " + this.countCarlicPlanets);
	};

}
