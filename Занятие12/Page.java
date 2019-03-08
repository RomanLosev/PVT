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

	ArrayList<Button> arrayList = new ArrayList<Button>();
	LinkedList<Field> linkedList = new LinkedList<Field>();
	HashSet<Label> hashSet = new HashSet<Label>();
	Map<Integer, Dropdown> hashMap = new HashMap<Integer, Dropdown>();

	public ArrayList<Button> addButtonInfo(Button but) {
		arrayList.add(but);
		return arrayList;
	}

	public ArrayList<Button> removeButtonInfo(int index) {
		arrayList.remove(index);
		return arrayList;
	}

	public ArrayList<Button> replaceButtonInfo(int index, Button but) {
		arrayList.set(index, but);
		return arrayList;
	}

	public void getAllButton() {
		System.out.println(arrayList);
	}

	public LinkedList<Field> addFieldInfo(Field fiel) {
		linkedList.add(fiel);
		return linkedList;
	}

	public LinkedList<Field> removeFieldInfo(int index) {
		linkedList.remove(index);
		return linkedList;
	}

	public LinkedList<Field> replaceFieldInfo(int index, Field fiel) {
		linkedList.set(index, fiel);
		return linkedList;
	}

	public void getAllField() {
		System.out.println(linkedList);
	}

	public HashSet<Label> addLabelInfo(Label lab) {
		hashSet.add(lab);
		return hashSet;
	}

	public HashSet<Label> removeLabelInfo(Label lab) {
		hashSet.remove(lab);
		return hashSet;
	}

	public void getAllLabel() {
		System.out.println(hashSet);
	}

	public Map<Integer, Dropdown> addDropdownInfo(int index, Dropdown drop) {
		hashMap.put(index, drop);
		return hashMap;
	}

	public Map<Integer, Dropdown> removeDropdownInfo(int index, Dropdown drop) {
		hashMap.remove(index, drop);
		return hashMap;
	}

	public Map<Integer, Dropdown> replaceDropdownInfo(int index, Dropdown drop) {
		hashMap.replace(index, drop);
		return hashMap;
	}

	public void getAllDropdown() {
		System.out.println(hashMap);
	}
}
