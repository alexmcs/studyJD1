package les3_7;
/*
 * 7*. ���� ����������� ����� n, �������������� ������� � �������� n x n.
 * �������� ������������������ ��������� ������� � �������� ���������.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Les3_7 {

	public static void main(String[] args) {
		System.out.println(
				"������ ��������� ���������� ������� �������� �����������.\n� ������� ������������������ ��������� ������� � �������� ���������.");
		Scanner sc = new Scanner(System.in);
		int menu = 1;
		while (menu != 0) {

			try {

				System.out.println("\n\n������� \"1\" - ����� ������ ����������� �������.");
				System.out.println("������� \"0\" - ����� ��������� ������ ���������.");
				System.out.println("--------------------------\n\n");

				menu = sc.nextInt();
				switch (menu) {
				case 1: {
					System.out.println("������� ����������� �������: ");
					int n = sc.nextInt();
					double[][] arr = new double[n][n];

					System.out.println("��������� ������� ����� ��������� ���:");
					for (int i = 0; i < n; i++) {
						for (int j = 0; j < n; j++) {
							arr[i][j] = (double) (Math.random() * 100 - 50);
							System.out.printf("%10.2f", arr[i][j]);
						}
						System.out.println();
					}
					double[] firstDiag = new double[n];
					double[] secondDiag = new double[n];
					for (int i = 0; i < n; i++) {
						firstDiag[i] = arr[i][i];
						secondDiag[i] = arr[n - 1 - i][i];
					}
					System.out.println("\n������������������ ��������� ������� ���������: ");
					for (int i = 0; i < n; i++) {
						System.out.printf("%10.2f", firstDiag[i]);
					}
					System.out.println("\n\n������������������ ��������� �������� ���������: ");
					for (int i = 0; i < n; i++) {
						System.out.printf("%10.2f", secondDiag[i]);
					}

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
