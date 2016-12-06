package lesson4;

/*
 * 1. В английском тексте каждую букву заменить ее порядковым номером в алфавите.
 *  При выводе в одной строке печатать текст с двумя пробелами между буквами,
 *   в следующей строке внизу под каждой буквой печатать ее номер.
 */

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class Task1 {

	public static void main(String[] args) {
		System.out.println("Данная программа меняет каждую букву в английском тексте на ее порядковый номер.");
		Scanner sc = new Scanner(System.in);
		DelSymbols delsymb = new DelSymbols();
		String alphabet = " abcdefghijklmnopqastuvwxyz";
		int menu = 1;
		while (menu != 0) {
			try {
				System.out.println("\n\nНажмите \"1\" - чтобы ввести новый текст.");
				System.out.println("Нажмите \"2\" - чтобы создать случайный текст.");
				System.out.println("Нажмите \"0\" - чтобы завершить работу программы.");
				System.out.println("--------------------------\n\n");

				menu = sc.nextInt();

				switch (menu) {
				case 1: {
					String text = new String();
					System.out.println("Введите английский текст. Любые символы, кроме английских и пробелов будут удалены.");
					sc.nextLine();
					text = delsymb.delSymbols(sc.nextLine().toLowerCase());

					char[] charArr = text.toCharArray();
					int[] intArr = new int[charArr.length];
					for (int i = 0; i < text.length(); i++) {
						
						intArr[i] = alphabet.indexOf(charArr[i]);
					}
					for (int i = 0; i < text.length(); i++) {
						System.out.printf("%4s", charArr[i]);
					}
					System.out.println();
					for (int i = 0; i < text.length(); i++) {
						System.out.printf("%4d", intArr[i]);
					}

					break;
				}
				case 2: {
					
					int n = 10; //количество генерируемых символов

					char[] charArr = new char[n];
					int[] intArr = new int[n];
					for (int i = 0; i < n; i++) {
						intArr[i] = (int)(Math.random()*alphabet.length());
						charArr[i] = alphabet.charAt(intArr[i]);
					}
					String text = new String(charArr);
					
					System.out.println("\n\nСгенерирована следующая строка: \n");
					System.out.println(text + "\n\n");

					for (int i = 0; i < text.length(); i++) {
						System.out.printf("%4s", charArr[i]);
					}
					System.out.println();
					for (int i = 0; i < text.length(); i++) {
						System.out.printf("%4d", intArr[i]);
					}

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
