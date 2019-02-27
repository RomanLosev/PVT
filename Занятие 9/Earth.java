package Pañê2;

public class Earth extends Planet {

	int earthDiametr;

	int earthVolume;

	void setEarthDiametr(int earthDiametr) {
		this.earthDiametr = earthDiametr;
	}

	void setEarthVolume(int earthVolume) {
		this.earthVolume = earthVolume;
	}

	int getEarthDiametr() {
		return this.earthDiametr;
	}

	int getEarthVolume() {
		return this.earthVolume;
	}

	public void printEarthDiametr() {
		System.out.println("Earth Diametr: " + this.earthDiametr);
	};

	public void printEarthVolume() {
		System.out.println("Earth Volume: " + this.earthVolume);
	};

}
