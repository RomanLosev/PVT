package core;

public class MassiveMain {

	public static void main(String[] args) {

		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}

		Massive massive = new Massive();

		massive.printMassiveAsLine(array);
		massive.printReverseMassiveAsLine(array);

		System.out.println(" SumOfElements: " + massive.getSumOfElements(array));

		massive.multiplyBy3(array);
		massive.multiplyBy3Reverse(array);

	}

}
