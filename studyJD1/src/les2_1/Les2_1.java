package les2_1;
/*
1. �������� ���������� ���� String c ����� ������� (�� ������ ��������).
����� �������� �� ����� ���������� �������� � ������ ������. 
����� ��������� ������ ������� (���� ����� �������� �� ������� �� +-1 �� �������),
� ���������� � ��� ������ ���� 2-� ����� ���������� ���� String � �������
�� ����������� ������. ���������� ������ �������� �� �����.
*/
import java.util.Scanner;

public class Les2_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� �����: ");
		String originMessage = sc.nextLine();
		int originLength = originMessage.length();
		System.out.println("����� ������ �����: " + originLength);
		String newMessageBegin = originMessage.substring(0, originLength/2); 
		String newMessageEnd = originMessage.substring(originLength/2);
		System.out.println(newMessageBegin);
		System.out.println(newMessageEnd);
		sc.close();
	}

}
