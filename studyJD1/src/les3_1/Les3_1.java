package les3_1;

/*
 * 1. Создайте массив содержащий 10 переменных типа float (заполнить любыми своими числами).
 *  Далее используя оператор "for" вывести все значения на экран в виде:
"значение" | "значение 2" | "значение 3" |  и тд.
После этого подсчитайте среднее арифметическое значение всех переменных
 и результат выведите на экран в виде:
average value =  "значение которое у вас получилось".

 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class Les3_1 {

	public static void main(String[] args) {
		System.out.println("Данная программа выводит среднее арифметическое значений массива.");
		Scanner sc = new Scanner(System.in);
		int menu = 1;
		while (menu != 0) {

			try {

				System.out.println("\n\nНажмите \"1\" - чтобы заполнить массив вручную.");
				System.out.println("Нажмите \"2\" - чтобы заполнить массив случайными числами.");
				System.out.println("Нажмите \"0\" - чтобы завершить работу программы.");
				System.out.println("--------------------------\n\n");

				menu = sc.nextInt();
				switch (menu) {
				case 1: {
					float[] arr = new float[10];
					for (int i = 0; i < arr.length; i++) {
						System.out.print("Введите очередное значение элемента массива: ");
						arr[i] = sc.nextFloat();
					}
					float sum = 0;
					System.out.println("Массив имеет следующий вид:");
					for (int i = 0; i < arr.length; i++) {
						System.out.printf("%-8.3f", arr[i]);
						sum += arr[i];
					}
					System.out.printf("\nСреднее арифметическое элементов массива: " + "%-8.3f", (sum / arr.length), "\n");
					break;
				}
				case 2: {
					float[] arr = new float[10];
					for (int i = 0; i < arr.length; i++) {
						arr[i] = (float) (Math.random() * 10 + 1);
					}
					float sum = 0;
					System.out.println("Массив имеет следующий вид:");
					for (int i = 0; i < arr.length; i++) {
						System.out.printf("%-8.3f", arr[i]);
						sum += arr[i];
					}
					System.out.printf("\nСреднее арифметическое элементов массива: " + "%-8.3f", (sum / arr.length), "\n");
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
