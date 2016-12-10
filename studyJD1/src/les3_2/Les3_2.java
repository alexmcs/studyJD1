package les3_2;
/*
 * 2. Создайте массив с 10-ю переменными типа int. Используя оператор "for"
 *  найдите и выведите на экран наименьшее и наибольшее значение в массиве.
min value =  "значение которое у вас получилось".
max value =  "значение которое у вас получилось".
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Les3_2 {

	public static void main(String[] args) {
		System.out.println("Данная программа генерирует массив с 10-ю целыми числами.\nИ выводит максимальное и минимальное значения массива.");
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
					for (int i = 0; i < arr.length; i++) {
						arr[i] = (int) (Math.random() * 1000 + 1);
					}
					int max = arr[1];
					int min = arr[1];
					System.out.println("Массив имеет следующий вид:");
					for (int i = 0; i < arr.length; i++) {
						System.out.printf("%-5d", arr[i]);
						if (max<arr[i]){
							max = arr[i];
						}
						if (min>arr[i]){
							min = arr[i];
						}
					}
					System.out.printf("\n\nМаксимальное значение массива: " + "%-5d", max, "\n");
					System.out.printf("\nМинимальное значение массива: " + "%-5d", min, "\n");
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
