package core2;

import java.util.ArrayList;

public class Button {

	String name;
	String action;

	public Button(String name, String action) {
		this.name = name;
		this.action = action;
	}

	public String toString() {

		return getClass() + " " + this.name + this.action;
	}

}
