package les2_7;

/*
 * 7. Напишите программу, которая запрашивает у пользователя
 *  номер дня недели, затем выводит название дня недели
 *   или сообщение об ошибке, если введены неверные данные.
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Les2_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Введите номер дня недели: ");
			int n = sc.nextInt();
			if ((n >= 1) && (n <= 7)) {
				switch (n){
				case 1: 
					System.out.println("Понедельник");
					break;
				case 2: 
					System.out.println("Вторник");
					break;
				case 3: 
					System.out.println("Среда");
					break;
				case 4: 
					System.out.println("Четверг");
					break;
				case 5: 
					System.out.println("Пятница");
					break;
				case 6: 
					System.out.println("Суббота");
					break;
				case 7: 
					System.out.println("Воскресенье");
					break;
					
				}
			}
			else
				System.out.println("Номер дня недели должен находиться в диапазоне от 1 до 7. Перезапустите программу.");
		}
		catch (InputMismatchException exception){
			System.out.println("Необходимо ввести номер дня недели. Перезапустите программу.");
		}
		sc.close();
	}

}