package les2_3;

/*
3. �������� ���������, ������� ��������� ������� ���� �����.
*/

import java.util.InputMismatchException;
import java.util.Scanner;
public class Les2_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("������� �������: ");
			//nextInt will throw InputMismatchException
			//if the next token does not match the Integer
			double dividend = sc.nextDouble();
			System.out.println("������� ��������: ");
			double divider= sc.nextDouble();
			while (divider == 0){
				System.out.println("�������� �� ����� ���� ������ ����! ���������� ��� ���: ");
				divider = sc.nextInt();
			}
			double privt = dividend / divider;
			System.out.println("������� ����� " + dividend + " � " + divider + " �����: " +privt);
			}
		catch (InputMismatchException exception){
			System.out.println("��������, �� ������ ������ �����! ��������� ��������� ������.");
			//when user put other than integer
		}
		sc.close();
	}

}

