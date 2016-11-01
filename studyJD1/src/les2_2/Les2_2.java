package les2_2;

import java.util.InputMismatchException;
/*
 2. �������� ���������, ������� ���������� ��� ��������� � ���������� �����.
 */
import java.util.Scanner;

public class Les2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("������� ������ �����: ");
			//nextInt will throw InputMismatchException
			//if the next token does not match the Integer
			int firstNum = sc.nextInt ();
			System.out.println("������� ������ �����: ");
			int secondNum = sc.nextInt ();
			
			if (firstNum > secondNum)
				System.out.println("����� " + firstNum + " ������ ����� "+ secondNum +".");
			else if (firstNum == secondNum)
				System.out.println("����� �����.");
			else
				System.out.println("����� " + firstNum + " ������ ����� "+ secondNum +".");
		}
		
		catch (InputMismatchException exception){
			//when user put other than integer
			System.out.println("��������, �� ������ ������ �����! ��������� ��������� ������.");
		}
		sc.close();
	}

}