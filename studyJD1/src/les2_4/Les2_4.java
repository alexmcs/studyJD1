package les2_4;
/*
 * 4. �������� ���������, ������� ���������, �������� �� ��� ����������.
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class Les2_4 {
	/*
	 * ��� ����������, ���� �� ������� �� ������ ��� �������,
	 *  �� ���� �� ������� �� 100 ��� �������, ��� �� ���������� ���.
	 *   ������, ���� �� ������� ��� ������� �� 400, ��� ���������� ���.
	 *    ����� �������, 2000 �. �������� ������ ���������� �����,
	 *     ������� ������ ���� ��� � 400 ���.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("������� ����� ���� ��� ��������, �������� �� �� ����������: ");
			int year = sc.nextInt();
			if (year % 400 == 0){
				System.out.println("��� " + year + " �������� ����������");
			}
			else if ((year % 100 != 0) && (year % 4 == 0)){
				System.out.println("��� " + year + " �������� ����������");
			}
			else {
				System.out.println("��� " + year + " �� �������� ����������");
			}
		}

		catch (InputMismatchException exception){
			System.out.println("���������� ������ ��� �������. ������������� ���������.");
		}
		sc.close();
	}

}
