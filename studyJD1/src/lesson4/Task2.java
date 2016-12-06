package lesson4;

/*2. Из небольшого текста удалить все символы, кроме пробелов, не являющиеся буквами.
 * 
 */
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class Task2 {

	public static void main(String[] args) {

		System.out.println(
				"Данная программа из небольшого текста удаляет все символы, кроме пробелов и английских букв.");
		Scanner sc = new Scanner(System.in);

		int menu = 1;
		String symbols = " abcdefghijklmnopqrstuvwxyz1234567890?!,.;:абвгдеёжзиклмнопрстуфхцчшщъыьэюя";

		while (menu != 0) {
			try {
				System.out.println("\n\nНажмите \"1\" - чтобы ввести новый текст.");
				System.out.println("Нажмите \"2\" - чтобы создать случайный текст.");
				System.out.println("Нажмите \"0\" - чтобы завершить работу программы.");
				System.out.println("--------------------------\n\n");

				menu = sc.nextInt();

				switch (menu) {
				case 1: {
					DelSymbols delsymb = new DelSymbols();
					String text = new String();
					System.out.println(
							"Введите английский текст. Любые символы, кроме английских и пробелов будут удалены.");
					sc.nextLine();
					text = delsymb.delSymbols(sc.nextLine().toLowerCase());
					System.out.println("\n\n" + text);

					break;
				}
				case 2: {
					DelSymbols delsymb = new DelSymbols();
					int n = 30; // количество генерируемых символов

					char[] charArr = new char[n];
					int[] intArr = new int[n];
					for (int i = 0; i < n; i++) {
						intArr[i] = (int) (Math.random() * symbols.length());
						charArr[i] = symbols.charAt(intArr[i]);
					}
					String genText = new String(charArr);

					System.out.println("\n\nСгенерирована следующая строка:");
					System.out.println(genText + "\n\n");
					System.out.println("Новая строка имеет вид:");
					System.out.println(delsymb.delSymbols(genText));

					break;
				}
				case 0: {
					System.out.println("Работа программы завершена.");
					System.exit(1);
					break;
				}
				default: {
					System.out.println("Выберите один пункт меню.");
					break;
				}
				}

			} catch (InputMismatchException exception) {
				System.out.println("Введены некорректные данные! Перезапустите программу.");
				System.exit(1);
			}
		}
		sc.close();
	}

}
