package core2;

public class Label {

	String name;

	public Label(String name) {
		this.name = name;

	}

	public String toString() {

		return getClass() + " " + this.name;
	}

}
