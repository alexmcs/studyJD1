package les2star1;
/*
 * Напишите программу, которая по дате определяет день недели, 
 * на который эта дата приходится. Для вычисления дня недели воспользуйтесь формулой:
 * (d+[1/5(13m-1)]+y+[y/4]+[c/4]-2c+777)mod7.
 * где, d — число месяца, m — номер месяца, если начинать счет
 *  с марта (март — 1, апрель — 2, ..., февраль — 12), Y — номер года в столетии,
 *   с — количество столетий. Квадратные скобки означают, что надо взять целую
 *    часть от значения, находящегося в скобках. Вычисленное по формуле значение
 *     определяет день недели: 1 — понедельник, 2 — вторник, ..., 6 — суббота, 0 — воскресенье
 */

import java.util.Scanner;
import java.util.InputMismatchException;
//import java.util.GregorianCalendar;

public class Les2star1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int menu = 1; //To manage the programm menu
		System.out.println("Эта программа вычисляет день недели по введенной дате.\n");
		int data = 1;
		String month = "январь";
		int year = 2000;
				
		while (menu !=0){
			System.out.println("\tдата: " + data + "; месяц: " + month + "; год: " + year +"\n");
			System.out.println("\tНажмите \"1\" - чтобы изменить дату;");
			System.out.println("\tНажмите \"2\" - чтобы изменить месяц;");
			System.out.println("\tНажмите \"3\" - чтобы изменить год;");
			System.out.println("\tНажмите \"0\" - чтобы завершить программу.\n");
			
			try {
				menu = sc.nextInt();
				WeekDay wd = new WeekDay(data,month,year);
				switch (menu){
				case 1:{
					System.out.print("Введите новую дату: ");
					data = sc.nextInt();
					//WeekDay wd = new WeekDay(data,month,year);
					System.out.println(wd.dayOfWeek(data,month,year));
					break;
				}
				case 2:{
					System.out.print("Введите новый месяц: ");
					try {
						month = sc.next();
						System.out.println(wd.dayOfWeek(data,month,year));
						break;
					}
					catch (ArrayIndexOutOfBoundsException exception){
						System.out.println("Вы ввели некорректные данные. Пожалуйста, сделайте выбор!");
						break;
					}
				}
				case 3:{
					System.out.print("Введите новый год: ");
					year = sc.nextInt();
					System.out.println(wd.dayOfWeek(data,month,year));
					break;
				}
				case 0:{
					System.out.println("Работа программы завершена.");
					System.exit(1);
				}
				default:{
					System.out.println("пожалуйста, сделайте выбор");
					break;
				}
				}
			}
			catch (InputMismatchException exception){
				System.out.println("Вы ввели некорректные данные. Перезапустите программу");
				break;
			}
			
		}
		sc.close();
	}

}
