package les2_7;

/*
 * 7. �������� ���������, ������� ����������� � ������������
 *  ����� ��� ������, ����� ������� �������� ��� ������
 *   ��� ��������� �� ������, ���� ������� �������� ������.
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Les2_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("������� ����� ��� ������: ");
			int n = sc.nextInt();
			if ((n >= 1) && (n <= 7)) {
				switch (n){
				case 1: 
					System.out.println("�����������");
					break;
				case 2: 
					System.out.println("�������");
					break;
				case 3: 
					System.out.println("�����");
					break;
				case 4: 
					System.out.println("�������");
					break;
				case 5: 
					System.out.println("�������");
					break;
				case 6: 
					System.out.println("�������");
					break;
				case 7: 
					System.out.println("�����������");
					break;
					
				}
			}
			else
				System.out.println("����� ��� ������ ������ ���������� � ��������� �� 1 �� 7. ������������� ���������.");
		}
		catch (InputMismatchException exception){
			System.out.println("���������� ������ ����� ��� ������. ������������� ���������.");
		}
		sc.close();
	}

}