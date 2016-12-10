package les2_3;

/*
3. Написать программу, которая вычисляет частное двух чисел.
*/

import java.util.InputMismatchException;
import java.util.Scanner;
public class Les2_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Введите делимое: ");
			//nextInt will throw InputMismatchException
			//if the next token does not match the Integer
			double dividend = sc.nextDouble();
			System.out.println("Введите делитель: ");
			double divider= sc.nextDouble();
			while (divider == 0){
				System.out.println("Делитель не может быть равным нулю! Попробуйте еще раз: ");
				divider = sc.nextInt();
			}
			double privt = dividend / divider;
			System.out.println("Частное чисел " + dividend + " и " + divider + " равно: " +privt);
			}
		catch (InputMismatchException exception){
			System.out.println("Извините, Вы должны ввести число! Запустите программу заново.");
			//when user put other than integer
		}
		sc.close();
	}

}

