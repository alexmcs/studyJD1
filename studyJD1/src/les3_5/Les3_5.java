package les3_5;
/*
 * 5. � ������� �� 10 ����� ��������� ������������ ��������� ������� �� ������� ����.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Les3_5 {

	public static void main(String[] args) {
		System.out.println(
				"������ ��������� ���������� ������ � 10-� �������.\n� ��������� ������������ ��������� ������� �� ������� ����.");
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
					System.out.println("������ ����� ��������� ���:");
					for (int i = 0; i < arr.length; i++) {
						arr[i] = (int) (Math.random() * 10 - 5);
						System.out.printf("%-5d", arr[i]);
					}
					int mult;
					if (arr[0] != 0) {
						mult = 1;

						for (int i = 0; i < arr.length; i++) {

							if (arr[i] != 0) {
								mult = mult * arr[i];
							} else
								break;
						}
					} else {
						mult = 0;
					}
					System.out.printf("\n\n������������ ��������� ������� �� 1�� ����: " + "%-5d", mult, "\n");
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
