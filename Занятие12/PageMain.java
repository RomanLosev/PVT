package core2;

import java.util.ArrayList;
import java.util.Arrays;

public class PageMain {

	public static void main(String[] args) {

		Page page = new Page();

		page.addButtonInfo(new Button("Enter", "  get info"));
		page.addButtonInfo(new Button("Delete", "  delete info"));
		page.addButtonInfo(new Button("Home", "  go home"));
		page.removeButtonInfo(1);
		page.replaceButtonInfo(0, new Button("Space", "  space"));
		page.getAllButton();

		page.addFieldInfo(new Field(1, 5000));
		page.addFieldInfo(new Field(2, 10000));
		page.addFieldInfo(new Field(3, 20000));
		page.removeFieldInfo(1);
		page.replaceFieldInfo(0, new Field(4, 30000));
		page.getAllField();

		Label label1 = new Label("Adidas");
		Label label2 = new Label("Nike");
		Label label3 = new Label("Reebok");

		page.addLabelInfo(label1);
		page.addLabelInfo(label2);
		page.addLabelInfo(label3);
		page.removeLabelInfo(label2);
		page.getAllLabel();

		Dropdown dropdown1 = new Dropdown("Car", Arrays.asList(new String[] { "Honda", "Tayota", "Opel" }), true);
		Dropdown dropdown2 = new Dropdown("Airplan", Arrays.asList(new String[] { "Boing", "Airbus", "Jet" }), true);
		Dropdown dropdown3 = new Dropdown("Bus", Arrays.asList(new String[] { "Neoplan", "Mercedes", "Maz" }), true);
		Dropdown dropdown4 = new Dropdown("Motorcycle", Arrays.asList(new String[] { "Suzuki", "Kawasaki", "Yamaha" }),
				true);

		page.addDropdownInfo(1, dropdown1);
		page.addDropdownInfo(2, dropdown2);
		page.addDropdownInfo(3, dropdown3);
		page.addDropdownInfo(4, dropdown4);
		page.removeDropdownInfo(3, dropdown3);
		page.replaceDropdownInfo(4, dropdown2);
		page.getAllDropdown();

	}

}
