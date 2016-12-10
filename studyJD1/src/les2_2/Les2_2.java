package les2_2;

import java.util.InputMismatchException;
/*
 2. Написать программу, которая сравнивает два введенных с клавиатуры числа.
 */
import java.util.Scanner;

public class Les2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Введите первое число: ");
			//nextInt will throw InputMismatchException
			//if the next token does not match the Integer
			int firstNum = sc.nextInt ();
			System.out.println("Введите второе число: ");
			int secondNum = sc.nextInt ();
			
			if (firstNum > secondNum)
				System.out.println("Число " + firstNum + " больше числа "+ secondNum +".");
			else if (firstNum == secondNum)
				System.out.println("Числа равны.");
			else
				System.out.println("Число " + firstNum + " меньше числа "+ secondNum +".");
		}
		
		catch (InputMismatchException exception){
			//when user put other than integer
			System.out.println("Извините, Вы должны ввести число! Запустите программу заново.");
		}
		sc.close();
	}

}