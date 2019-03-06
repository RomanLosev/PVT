package core2;

import java.util.List;

public class Dropdown {

	List<String> options;
	boolean isSelected;
	String name;

	public Dropdown(String name, List<String> options, boolean isSelected) {
		this.name = name;
		this.options = options;
		this.isSelected = isSelected;

	}

	public String toString() {

		return getClass() + " " + this.name + this.options + this.isSelected;
	}
}
