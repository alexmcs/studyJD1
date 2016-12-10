package les2star4;

/*
 * 4*. Написать программу, которая выводит таблицу квадратов первых десяти целых положительных чисел от 0 до 10
 */
import java.util.Scanner;
import java.util.InputMismatchException;


public class Les2star4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int menu = 1;
		System.out.println("Данная программа выводит таблицу произведений целых чисел до введенного числа");
		
		while (menu !=0){
			System.out.println("\tНажмите \"1\" - чтобы ввести новое число;");
			System.out.println("\tНажмите \"0\" - чтобы завершить программу.\n");
			
			try {
				menu = sc.nextInt();
				switch (menu){
				case 1:{
					System.out.print("Выберите число: ");
					int n = sc.nextInt();
					if (n > 0){
						for (int j = 1; j <= n; j ++){
							for (int i = 1; i <= n; i++){
								System.out.print(i*j + "\t");
							}
							System.out.print("\n");
						}
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

		