package core3;

public class Massive {

	public void tryCatch() {

		int[] mas = { 1, 2, 3, 4, 5 };
		{

			try {
				System.out.println(mas[10]);

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Поймали исключение");

			}
		}
	}

	public void tryCatchCatch() {
		int[] mas = { 1, 2, 3, 4, 5 };
		{

			try {
				mas[5] = 4;
				mas[6] = Integer.parseInt("abc");

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Поймали исключение");

			} catch (NumberFormatException e) {
				System.out.println("Ошибка преобразования данных");

			}
		}

	}
	
	public void tryMultiCatch() {
		int[] mas = { 1, 2, 3, 4, 5 };
		{

			try {
				mas[5] = 4;
				mas[6] = Integer.parseInt("abc");

			} catch (ArrayIndexOutOfBoundsException  | NumberFormatException e) {
				System.out.println("Поймали исключение");
				System.out.println(e.getStackTrace());

			} 
		}

	}
	public void tryCatchFinally() {

		int[] mas = { 1, 2, 3, 4, 5 };
		{

			try {
				System.out.println(mas[10]);

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Поймали исключение");

			}
			finally {
				System.out.println("Я работаю всегда");
		}
	}
	
}}
