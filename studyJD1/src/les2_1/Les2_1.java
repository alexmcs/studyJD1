package les2_1;
/*
1. Создайте переменную типа String c любым текстом (не сильно короткое).
Далее выведите на экран количество символов в данной строке. 
Далее разделите строку пополам (если ровно поделить не выходит то +-1 не страшно),
в результате у вас должно быть 2-е новых переменных типа String с частями
из изначальной строки. Полученные строки выведите на экран.
*/
import java.util.Scanner;

public class Les2_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите любой текст: ");
		String originMessage = sc.nextLine();
		int originLength = originMessage.length();
		System.out.println("Длина строки равна: " + originLength);
		String newMessageBegin = originMessage.substring(0, originLength/2); 
		String newMessageEnd = originMessage.substring(originLength/2);
		System.out.println(newMessageBegin);
		System.out.println(newMessageEnd);
		sc.close();
	}

}
