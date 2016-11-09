package les3_2;
/*
 * 2. �������� ������ � 10-� ����������� ���� int. ��������� �������� "for"
 *  ������� � �������� �� ����� ���������� � ���������� �������� � �������.
min value =  "�������� ������� � ��� ����������".
max value =  "�������� ������� � ��� ����������".
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Les3_2 {

	public static void main(String[] args) {
		System.out.println("������ ��������� ���������� ������ � 10-� ������ �������.\n� ������� ������������ � ����������� �������� �������.");
		Scanner sc = new Scanner(System.in);
		int menu = 1;
		while (menu != 0) {

			try {

				System.out.println("\n\n������� \"1\" - ����� ��������� ������ ���������� �������.");
				System.out.println("������� \"0\" - ����� ��������� ������ ���������.");
				System.out.println("--------------------------\n\n");

				menu = sc.nextInt();
				switch (menu) {
				case 1: {
					int[] arr = new int[10];
					for (int i = 0; i < arr.length; i++) {
						arr[i] = (int) (Math.random() * 1000 + 1);
					}
					int max = arr[1];
					int min = arr[1];
					System.out.println("������ ����� ��������� ���:");
					for (int i = 0; i < arr.length; i++) {
						System.out.printf("%-5d", arr[i]);
						if (max<arr[i]){
							max = arr[i];
						}
						if (min>arr[i]){
							min = arr[i];
						}
					}
					System.out.printf("\n\n������������ �������� �������: " + "%-5d", max, "\n");
					System.out.printf("\n����������� �������� �������: " + "%-5d", min, "\n");
					break;
				}
				case 0: {
					System.out.println("������ ��������� ���������.");
					System.exit(1);
					break;
				}
				default: {
					System.out.println("�������� ���� ����� ����.");
					break;
				}
				}

			} catch (InputMismatchException exception) {
				System.out.println("������� ������������ ������! ������������� ���������.");
				System.exit(1);
			}
			
		}
		sc.close();
	}

}
