package les2star7;

/*
 * 7**. Написать программу калькулятор, который умеет складывать и делить с консольным меню.
 *  Выход из программы осуществляется введением символа q
 */
import java.util.Scanner;
import java.util.InputMismatchException;


public class Les2star7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String menu = null;
		double firstNum = 0;
		double secondNum = 0;
		String operation = "0";
		double result = 0;
		System.out.println("Данная программа представляет собой консольный калькулятор\n");
		
		while (menu !="q"){

			System.out.println("\nПервое число: " + firstNum);
			System.out.println("Операция: " + operation);
			System.out.println("Второе число: " + secondNum);
			System.out.println("Результат операции: " + result);
			System.out.println("\n\tНажмите \"1\" - чтобы выбрать первое число;");
			System.out.println("\tНажмите \"2\" - чтобы выбрать второе число;");
			System.out.println("\tНажмите \"+\" - чтобы выполнить операцию сложения;");
			System.out.println("\tНажмите \"-\" - чтобы выполнить операцию вычитания;");
			System.out.println("\tНажмите \"*\" - чтобы выполнить операцию умножения;");
			System.out.println("\tНажмите \"/\" - чтобы выполнить операцию деления;");
			System.out.println("\tНажмите \"q\" - чтобы завершить программу.\n");
			
			try {
				menu = sc.next();
				switch (menu){
				case "1":{
					System.out.print("Выберите первое число: ");
					firstNum = sc.nextDouble();
					if (!operation.equals("0")){
						Operation op = new Operation();
						result = op.result(firstNum, operation, secondNum);
						break;
					}
					else
						break;
				}
				case "2":{
					System.out.print("Выберите второе число: ");
					secondNum = sc.nextDouble();
					if (!operation.equals("0")){
						Operation op = new Operation();
						result = op.result(firstNum, operation, secondNum);
						break;
					}
					else
						break;
				}
				case "+":{
					operation = menu;
					Operation op = new Operation();
					result = op.result(firstNum, operation, secondNum);
					break;
				}
				case "-":{
					operation = menu;
					Operation op = new Operation();
					result = op.result(firstNum, operation, secondNum);
					break;
				}
				case "*":{
					operation = menu;
					Operation op = new Operation();
					result = op.result(firstNum, operation, secondNum);
					break;
				}
				case "/":{
					if (secondNum != 0){
						operation = menu;
						Operation op = new Operation();
						result = op.result(firstNum, operation, secondNum);
						break;
					}
					else {
						System.out.println("Делить на 0 нельзя!");
						break;
					}
				}
							
				case "q":{
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

		