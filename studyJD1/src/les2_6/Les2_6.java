package les2_6;
/*
 * 6. Написать программу, которая после введенного с клавиатуры
 *  числа (в диапазоне от 1 до 999), обозначающего денежную
 *   единицу, дописывает слово "рубль" в правильной форме.
 *    Например, 12 рублей, 21 рубль и т. д.
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Les2_6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Введите число в диапазоне от 1 до 999: ");
			int s = sc.nextInt();
			if ((s >= 1) && (s <= 999)){
				if (((s % 100)/10) == 1) {
					System.out.println(s + " рублей");
				}
				else {
					switch (s % 10){
					case 1:
						System.out.println(s + " рубль");
						break;
					case 2:
						System.out.println(s + " рубля");
						break;
					case 3:
						System.out.println(s + " рубля");
						break;
					case 4:
						System.out.println(s + " рубля");
						break;
					default:
						System.out.println(s + " рублей");
					}
				}
			}
			else
				System.out.println("Необходимо ввести число в указанном диапазоне. Перезапустите программу");
		}
		catch (InputMismatchException exception){
			System.out.println("Необходимо ввести число в указанном диапазоне. Перезапустите программу.");
		}
		sc.close();
	}

}