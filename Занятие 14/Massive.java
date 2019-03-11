package Core;

public class Massive {

	int[] mas;

	public int[] massiveReverseOrder(int[] anyMas) {
		int[] resultMas = new int[anyMas.length];
		for (int i = anyMas.length - 1; i >= 0; i--)
			resultMas[i] = anyMas[i];
		return resultMas;
	}

	public int getSumOfElements(int[] anyMas) {
		int sum = 0;
		for (int i = 0; i < anyMas.length; i++) {
			sum = sum + anyMas[i];
		}
		return sum;
	}

	public int getMultiplyElements(int[] anyMas) {
		int umn = 1;
		for (int i = 0; i < anyMas.length; i++) {
			umn = umn * anyMas[i];
		}
		return umn;
	}

	public int[] multiplyBy3(int[] anyMas) {
		int[] resultMas = new int[anyMas.length];
		for (int i = 0; i < anyMas.length; i++)
			resultMas[i] = anyMas[i] * 3;
		return resultMas;
	}

	public int[] divisionBy0(int[] anyMas) {
		int[] resultMas = new int[anyMas.length];
		for (int i = 0; i < anyMas.length; i++)
			resultMas[i] = anyMas[i] / 0;
		return resultMas;
	}

	public void massiveException() {
		int[] mas = { 1, 2, 3, 4, 5 };
		System.out.println(mas[6]);

	}
}
