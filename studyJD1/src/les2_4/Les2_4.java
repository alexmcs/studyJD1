package les2_4;
/*
 * 4. Написать программу, которая проверяет, является ли год високосным.
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class Les2_4 {
	/*
	 * Год високосный, если он делится на четыре без остатка,
	 *  но если он делится на 100 без остатка, это не високосный год.
	 *   Однако, если он делится без остатка на 400, это високосный год.
	 *    Таким образом, 2000 г. является особым високосным годом,
	 *     который бывает лишь раз в 400 лет.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Введите номер года для проверки, является ли он високосным: ");
			int year = sc.nextInt();
			if (year % 400 == 0){
				System.out.println("Год " + year + " является високосным");
			}
			else if ((year % 100 != 0) && (year % 4 == 0)){
				System.out.println("Год " + year + " является високосным");
			}
			else {
				System.out.println("Год " + year + " не является високосным");
			}
		}

		catch (InputMismatchException exception){
			System.out.println("Необходимо ввести год цифрами. Перезапустите программу.");
		}
		sc.close();
	}

}
