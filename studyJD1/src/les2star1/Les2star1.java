package les2star1;
/*
 * Ќапишите программу, котора€ по дате определ€ет день недели, 
 * на который эта дата приходитс€. ƒл€ вычислени€ дн€ недели воспользуйтесь формулой:
 * (d+[1/5(13m-1)]+y+[y/4]+[c/4]-2c+777)mod7.
 * где, d Ч число мес€ца, m Ч номер мес€ца, если начинать счет
 *  с марта (март Ч 1, апрель Ч 2, ..., февраль Ч 12), Y Ч номер года в столетии,
 *   с Ч количество столетий.  вадратные скобки означают, что надо вз€ть целую
 *    часть от значени€, наход€щегос€ в скобках. ¬ычисленное по формуле значение
 *     определ€ет день недели: 1 Ч понедельник, 2 Ч вторник, ..., 6 Ч суббота, 0 Ч воскресенье
 */

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.GregorianCalendar;

public class Les2star1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int menu = 1; //To manage the programm menu
		System.out.println("Ёта программа вычисл€ет день недели по введенной дате.\n");
		int data = 1;
		String month = "€нварь";
		int year = 2000;
				
		while (menu !=0){
			System.out.println("\tдата: " + data + "; мес€ц: " + month + "; год: " + year +"\n");
			System.out.println("\tЌажмите \"1\" - чтобы изменить дату;");
			System.out.println("\tЌажмите \"2\" - чтобы изменить мес€ц;");
			System.out.println("\tЌажмите \"3\" - чтобы изменить год;");
			System.out.println("\tЌажмите \"0\" - чтобы завершить программу.\n");
			
			try {
				menu = sc.nextInt();
				WeekDay wd = new WeekDay(data,month,year);
				switch (menu){
				case 1:{
					System.out.print("¬ведите новую дату: ");
					data = sc.nextInt();
					//WeekDay wd = new WeekDay(data,month,year);
					System.out.println(wd.dayOfWeek(data,month,year));
					break;
				}
				case 2:{
					System.out.print("¬ведите новый мес€ц: ");
					try {
						month = sc.next();
						System.out.println(wd.dayOfWeek(data,month,year));
						break;
					}
					catch (ArrayIndexOutOfBoundsException exception){
						System.out.println("¬ы ввели некорректные данные. ѕожалуйста, сделайте выбор!");
						break;
					}
				}
				case 3:{
					System.out.print("¬ведите новый год: ");
					year = sc.nextInt();
					System.out.println(wd.dayOfWeek(data,month,year));
					break;
				}
				case 0:{
					System.out.println("–абота программы завершена.");
					System.exit(1);
				}
				default:{
					System.out.println("пожалуйста, сделайте выбор");
					break;
				}
				}
			}
			catch (InputMismatchException exception){
				System.out.println("¬ы ввели некорректные данные. ѕерезапустите программу");
				break;
			}
			
		}
		sc.close();
	}

}
