package les3_4;

/*
 * 4. � ������� �� 10 ����� ���������� ���������� ������������� ��������� �������.
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class Les3_4 {

	public static void main(String[] args) {
		System.out.println("������ ��������� ���������� ������ � 10-� �������.\n� ������� ���������� ������������� ��������� �������.");
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
					float[] arr = new float[10];
					for (int i = 0; i < arr.length; i++) {
						arr[i] = (float) (Math.random() * 1000 - 500);
					}
					int num = 0;
					
					System.out.println("������ ����� ��������� ���:");
					for (int i = 0; i < arr.length; i++) {
						System.out.printf("%-10.2f", arr[i]);
						if (arr[i]<0){
							num +=1;
						}
					}
					System.out.printf("\n\n���������� ������������� ���������: " + "%-5d", num, "\n");
					
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
