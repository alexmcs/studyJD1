package les3_3;

/*
 * 3. � ������� �� 15 ����� ����� ���������� ������� � ��� ������ � �������. 
*/
import java.util.Scanner;
import java.util.InputMismatchException;

public class Les3_3 {

	public static void main(String[] args) {
		System.out.println("������ ��������� ���������� ������ � 15-� ������ �������.\n� ������� ����������� �������� � ��� ������ � �������.");
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
					int[] arr = new int[15];
					for (int i = 0; i < arr.length; i++) {
						arr[i] = (int) (Math.random() * 1000 - 500);
					}
					int min = arr[1];
					int index = 0;
					System.out.println("������ ����� ��������� ���:");
					for (int i = 0; i < arr.length; i++) {
						System.out.printf("%-6d", arr[i]);
						if (min>arr[i]){
							min = arr[i];
							index = i;
						}
					}
					System.out.printf("\n\n����������� �������� �������: " + "%-5d", min, "\n");
					System.out.printf("\n������ ������������ ��������: " + "%-5d", index, "\n");
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
