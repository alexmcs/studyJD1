package les2star2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 2*. Написать программу, которая вычисляет сумму первых n членов ряда:
 *  1 + 1/2 + 1/3 + 1/4 +…. Количество суммируемых членов ряда задается
 *   во время работы программы.

 */

public class Les2star2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int menu = 1;
		System.out.println("Данная программа вычисляет сумму первых n членов ряда:");
		System.out.println("1 + 1/2 + 1/3 + 1/4 +….\n");
		
		while (menu !=0){
			System.out.println("\tНажмите \"1\" - чтобы выбрать n - количество членов ряда;");
			System.out.println("\tНажмите \"0\" - чтобы завершить программу.\n");
			
			try {
				menu = sc.nextInt();
				switch (menu){
				case 1:{
					System.out.print("Выберите n: ");
					int n = sc.nextInt();
					if (n > 0){
						double sum = 0;
						for (int i=1; i<=n; i++){
							sum +=(double) 1/i;
						}
						System.out.println("Сумма " + n + " первых членов составит: " + sum);
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
