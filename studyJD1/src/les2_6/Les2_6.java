package les2_6;
/*
 * 6. �������� ���������, ������� ����� ���������� � ����������
 *  ����� (� ��������� �� 1 �� 999), ������������� ��������
 *   �������, ���������� ����� "�����" � ���������� �����.
 *    ��������, 12 ������, 21 ����� � �. �.
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Les2_6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("������� ����� � ��������� �� 1 �� 999: ");
			int s = sc.nextInt();
			if ((s >= 1) && (s <= 999)){
				if (((s % 100)/10) == 1) {
					System.out.println(s + " ������");
				}
				else {
					switch (s % 10){
					case 1:
						System.out.println(s + " �����");
						break;
					case 2:
						System.out.println(s + " �����");
						break;
					case 3:
						System.out.println(s + " �����");
						break;
					case 4:
						System.out.println(s + " �����");
						break;
					default:
						System.out.println(s + " ������");
					}
				}
			}
			else
				System.out.println("���������� ������ ����� � ��������� ���������. ������������� ���������");
		}
		catch (InputMismatchException exception){
			System.out.println("���������� ������ ����� � ��������� ���������. ������������� ���������.");
		}
		sc.close();
	}

}