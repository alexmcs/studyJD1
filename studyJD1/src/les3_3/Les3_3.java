package les3_3;

/*
 * 3. В массиве из 15 чисел найти наименьший элемент и его индекс в массиве. 
*/
import java.util.Scanner;
import java.util.InputMismatchException;

public class Les3_3 {

	public static void main(String[] args) {
		System.out.println("Данная программа генерирует массив с 15-ю целыми числами.\nИ выводит минимальное значение и его индекс в массиве.");
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
					int[] arr = new int[15];
					for (int i = 0; i < arr.length; i++) {
						arr[i] = (int) (Math.random() * 1000 - 500);
					}
					int min = arr[1];
					int index = 0;
					System.out.println("Массив имеет следующий вид:");
					for (int i = 0; i < arr.length; i++) {
						System.out.printf("%-6d", arr[i]);
						if (min>arr[i]){
							min = arr[i];
							index = i;
						}
					}
					System.out.printf("\n\nМинимальное значение массива: " + "%-5d", min, "\n");
					System.out.printf("\nИндекс минимального значения: " + "%-5d", index, "\n");
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
