package core;

public class Massive {

	public int mas[];

	public int size;

	public void printMassiveAsLine(int[] anyMas) {
		System.out.print("Massive: ");
		for (int i = 0; i < anyMas.length; i++) {

			System.out.print(anyMas[i]);
		}
	}

	public void printReverseMassiveAsLine(int[] anyMas) {
		System.out.print(" ReverseMassive: ");

		for (int i = anyMas.length - 1; i >= 0; i--) {

			System.out.print(anyMas[i]);
		}

	}

	public static int getSumOfElements(int[] anyMas) {
		int sum = 0;
		for (int i = 0; i < anyMas.length; i++) {
			sum = sum + anyMas[i];
		}
		return sum;

	}

	public void multiplyBy3(int[] anyMas) {
		System.out.print("MultiplyBy3: ");
		int[] resultMas = new int[anyMas.length];
		for (int i = 0; i < anyMas.length; i++) {
			resultMas[i] = anyMas[i] * 3;

			System.out.print(resultMas[i]);
		}
	}

	public void multiplyBy3Reverse(int[] anyMas) {
		System.out.print(" MultiplyBy3_1: ");

		int[] resultMas = new int[anyMas.length];
		for (int i = 0; i < anyMas.length; i++) {
			resultMas[i] = anyMas[i] * 3;

			System.out.print(resultMas[i]);
		}

		System.out.print(" ReverseMultiplyBy3: ");

		for (int i = resultMas.length - 1; i >= 0; i--) {

			System.out.print(resultMas[i]);
		}
	}

}
