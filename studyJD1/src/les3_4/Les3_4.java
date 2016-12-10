package les3_4;

/*
 * 4. В массиве из 10 чисел подсчитать количество отрицательных элементов массива.
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class Les3_4 {

	public static void main(String[] args) {
		System.out.println("Данная программа генерирует массив с 10-ю числами.\nИ считает количество отрицательных элементов массива.");
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
					float[] arr = new float[10];
					for (int i = 0; i < arr.length; i++) {
						arr[i] = (float) (Math.random() * 1000 - 500);
					}
					int num = 0;
					
					System.out.println("Массив имеет следующий вид:");
					for (int i = 0; i < arr.length; i++) {
						System.out.printf("%-10.2f", arr[i]);
						if (arr[i]<0){
							num +=1;
						}
					}
					System.out.printf("\n\nКоличество отрицательных элементов: " + "%-5d", num, "\n");
					
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
