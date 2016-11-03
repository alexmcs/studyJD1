package les2star7;

/*
 * 7**. �������� ��������� �����������, ������� ����� ���������� � ������ � ���������� ����.
 *  ����� �� ��������� �������������� ��������� ������� q
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
		System.out.println("������ ��������� ������������ ����� ���������� �����������\n");
		
		while (menu !="q"){

			System.out.println("\n������ �����: " + firstNum);
			System.out.println("��������: " + operation);
			System.out.println("������ �����: " + secondNum);
			System.out.println("��������� ��������: " + result);
			System.out.println("\n\t������� \"1\" - ����� ������� ������ �����;");
			System.out.println("\t������� \"2\" - ����� ������� ������ �����;");
			System.out.println("\t������� \"+\" - ����� ��������� �������� ��������;");
			System.out.println("\t������� \"-\" - ����� ��������� �������� ���������;");
			System.out.println("\t������� \"*\" - ����� ��������� �������� ���������;");
			System.out.println("\t������� \"/\" - ����� ��������� �������� �������;");
			System.out.println("\t������� \"q\" - ����� ��������� ���������.\n");
			
			try {
				menu = sc.next();
				switch (menu){
				case "1":{
					System.out.print("�������� ������ �����: ");
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
					System.out.print("�������� ������ �����: ");
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
						System.out.println("������ �� 0 ������!");
						break;
					}
				}
							
				case "q":{
					System.out.println("������ ��������� ���������.");
					System.exit(1);
				}
				default:{
					System.out.println("����������, �������� ����� ����.");
					break;
				}
				}
			}
			catch (InputMismatchException exception){
				System.out.println("�� ����� ������������ ��������.");
				break;
			}
		}
		sc.close();
	}
}

		