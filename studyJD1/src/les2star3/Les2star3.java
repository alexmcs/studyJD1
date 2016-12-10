package les2star3;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 3*. Написать программу, которая вычисляет факториал введенного с клавиатуры числа.
 */

public class Les2star3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int menu = 1;
		System.out.println("Данная программа вычисляет факториал введенного числа");
		
		while (menu !=0){
			System.out.println("\tНажмите \"1\" - чтобы ввести новое число;");
			System.out.println("\tНажмите \"0\" - чтобы завершить программу.\n");
			
			try {
				menu = sc.nextInt();
				switch (menu){
				case 1:{
					System.out.print("Выберите число для расчета факториала: ");
					int n = sc.nextInt();
					if (n > 0){
						long fac = 1;
						for (int i=1; i<=n; i++){
							fac = fac*i;
						}
						System.out.println("Факториал числа  " + n + " составляет: " + fac);
						break;
					}
					else {
						System.out.println("Необходимо ввести положительное число.");
						break;
					}
				}
				case 0:{
					System.out.println("Работа программы завершена.");
					System.exit(1);
				}
				default:{
					System.out.println("Пожалуйста, выберите пункт меню.");
					break;
				}
				}
			}
			catch (InputMismatchException exception){
				System.out.println("Вы ввели некорректное значение.");
				break;
			}
		}	
	sc.close();

	}

}
