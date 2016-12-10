package les2star6;

/*
 * 6*. Напишите программу, которая выводит на экран значения функции у = 2х^2-5х-8 в диапазоне от -4 до 4.
 *  Шаг изменения аргумента 0,5.
 */
import java.util.Scanner;
import java.util.InputMismatchException;


public class Les2star6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int menu = 1;
		System.out.println("Данная программа выводит на экран значения функции у = 2х^2-5х-8 в диапазоне от -4 до 4");
		
		while (menu !=0){
			System.out.println("\tНажмите \"1\" - чтобы запустить программу;");
			System.out.println("\tНажмите \"0\" - чтобы завершить программу.\n");
			
			try {
				menu = sc.nextInt();
				switch (menu){
				case 1:{
					int n = 4;
					System.out.println("x\ty");
					for (int i =(int) -n*2; i <=(int) n*2; i++){
						float x = (float) i/2;
						float y = 2*x*x - 5*x - 8;
						System.out.println(x + "\t" + y);
					}
					break;
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

		