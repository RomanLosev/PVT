package core2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Page {

	public static void main(String[] args) {

		Button button1 = new Button("Enter", "  get info");
		Button button2 = new Button("Delete", "  delete info");
		Button button3 = new Button("Home", "  go home");

		ArrayList<Button> arrayList = new ArrayList<Button>();

		arrayList.add(button1);
		arrayList.add(button2);
		arrayList.add(button3);

		for (int i = 0; i < arrayList.size(); i++) {

			System.out.println(arrayList.get(i));
		}

		arrayList.set(1, new Button("Pause", "  get stop"));

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

		arrayList.remove(button3);

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

		Field field1 = new Field(1, 5000);
		Field field2 = new Field(2, 10000);
		Field field3 = new Field(3, 20000);

		LinkedList<Field> linkedList = new LinkedList<Field>();

		linkedList.add(field1);
		linkedList.add(field2);
		linkedList.add(field3);

		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}

		linkedList.set(0, field3);

		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}

		linkedList.removeLast();

		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}

		HashSet<Label> hashSet = new HashSet<Label>();

		Label label1 = new Label("Adidas");
		Label label2 = new Label("Nike");
		Label label3 = new Label("Reebok");

		hashSet.add(label1);
		hashSet.add(label2);
		hashSet.add(label3);

		Iterator<Label> iterator = hashSet.iterator();

		while (iterator.hasNext()) {

			System.out.println(iterator.next());
		}

		hashSet.remove(label2);

		iterator = hashSet.iterator();

		while (iterator.hasNext()) {

			System.out.println(iterator.next());
		}

		Map<Integer, Dropdown> hashMap = new HashMap<Integer, Dropdown>(); // Map

		Dropdown dropdown1 = new Dropdown("Car", Arrays.asList(new String[] { "Honda", "Tayota", "Opel" }), true);
		Dropdown dropdown2 = new Dropdown("Airplan", Arrays.asList(new String[] { "Boing", "Airbus", "Jet" }), true);
		Dropdown dropdown3 = new Dropdown("Bus", Arrays.asList(new String[] { "Neoplan", "Mercedes", "Maz" }), true);
		Dropdown dropdown4 = new Dropdown("Motorcycle", Arrays.asList(new String[] { "Suzuki", "Kawasaki", "Yamaha" }),
				true);

		hashMap.put(1, dropdown1);
		hashMap.put(2, dropdown2);
		hashMap.put(3, dropdown3);

		Set<Map.Entry<Integer, Dropdown>> set = hashMap.entrySet();
		for (Map.Entry<Integer, Dropdown> me : set) {
			System.out.println("ключ " + me.getKey() + ", значение = " + me.getValue());
		}

		hashMap.remove(2, dropdown2);

		Set<Map.Entry<Integer, Dropdown>> set1 = hashMap.entrySet();
		for (Map.Entry<Integer, Dropdown> me : set1) {
			System.out.println("ключ " + me.getKey() + ", значение = " + me.getValue());
		}

		hashMap.replace(3, dropdown4);

		Set<Map.Entry<Integer, Dropdown>> set2 = hashMap.entrySet();
		for (Map.Entry<Integer, Dropdown> me : set2) {
			System.out.println("ключ " + me.getKey() + ", значение = " + me.getValue());
		}

	}
}
