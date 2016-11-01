package les2_5;
/*
 * 5. Написать программу, которая вычисляет оптимальный вес для пользователя,
 *  сравнивает его с реальным и выдает рекомендацию о необходимости
 *   поправиться или похудеть. Оптимальный вес вычисляется по формуле:
 *    Рост (см) — 100.
 */
import java.util.Scanner;
import java.util.InputMismatchException;
import static java.lang.Math.*;

public class Les2_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Введите Ваш вес в кг: ");
			double weight = sc.nextDouble();
			System.out.println("Введите Ваш рост в см: ");
			double height = sc.nextDouble();
			double optimalWeight = height - 100; //Optimal weight calculation
			double aberration = (abs(weight - optimalWeight)/optimalWeight); // Calculation of deviation from optimal weight. In percentage.
			if ((aberration*100) <= 1){
				System.out.println("У Вас оптимальный вес!");
			}
			else if ((aberration*100) <= 7){
				System.out.println("У Вас небольшие проблемы с весом.");
				if (weight < optimalWeight)
					System.out.println("Вам следует набрать около " + round(optimalWeight - weight) + "кг.");
				else
					System.out.println("Вам следует скинуть около " + round(weight - optimalWeight) + "кг.");
			}
			else {
				System.out.println("У Вас серьезные проблемы с весом.");
				if (weight < optimalWeight)
					System.out.println("Настоятельно рекомендую Вам набрать не менее " + round(optimalWeight - weight) + "кг.");
				else
					System.out.println("Настоятельно рекомендую Вам скинуть не менее " + round(weight - optimalWeight) + "кг.");
			}
		}
		catch (InputMismatchException exception){
			System.out.println("");
		}
		sc.close();
	}

}
