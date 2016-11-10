package les3_6;

/*
 * 6. � ������� �� 10 ����� ����������� ��� ���� � ����� �������, �� ����� ������� ��������� ���������. 
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Les3_6 {

	public static void main(String[] args) {
		System.out.println(
				"������ ��������� ���������� ������ � 10-� �������.\n� ������������ ��� ���� � �����, �� ���� ������� ��������� ���������.");
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
					int count = 0; //For counting zeros
					System.out.println("�������� ������ ����� ��������� ���:");
					for (int i = 0; i < arr.length; i++) {
						arr[i] = (int) (Math.random() * 10 - 5);
						System.out.printf("%-5d", arr[i]);
					}
					for (int i = 0; i < arr.length; i++) {

						while (arr[i] == 0) {
							for (int j = i; j < arr.length-1; j++){
								arr[j] = arr [j+1];
							}
							arr[arr.length-1] = 0;
							count +=1;
							if (i == count){
								break;
							}
						}
					}
					System.out.println("����� ������ ����� ��������� ���:");
					for (int i = 0; i < arr.length; i++) {
						System.out.printf("%-5d", arr[i]);
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
