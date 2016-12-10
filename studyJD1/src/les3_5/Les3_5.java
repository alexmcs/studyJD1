package les3_5;
/*
 * 5. В массиве из 10 чисел вычислить произведение элементов массива до первого нуля.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Les3_5 {

	public static void main(String[] args) {
		System.out.println(
				"Данная программа генерирует массив с 10-ю числами.\nИ вычисляет произведение элементов массива до первого нуля.");
		Scanner sc = new Scanner(System.in);
		int menu = 1;
		while (menu != 0) {

			try {

				System.out.println("\n\nНажмите \"1\" - чтобы заполнить массив случайными числами.");
				System.out.println("Нажмите \"0\" - чтобы завершить работу программы.");
				System.out.println("--------------------------\n\n");

				menu = sc.nextInt();
				switch (menu) {
				case 1: {
					int[] arr = new int[10];
					System.out.println("Массив имеет следующий вид:");
					for (int i = 0; i < arr.length; i++) {
						arr[i] = (int) (Math.random() * 10 - 5);
						System.out.printf("%-5d", arr[i]);
					}
					int mult;
					if (arr[0] != 0) {
						mult = 1;

						for (int i = 0; i < arr.length; i++) {

							if (arr[i] != 0) {
								mult = mult * arr[i];
							} else
								break;
						}
					} else {
						mult = 0;
					}
					System.out.printf("\n\nПроизведение элементов массива до 1го нуля: " + "%-5d", mult, "\n");
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
