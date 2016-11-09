package les3_1;

/*
 * 1. �������� ������ ���������� 10 ���������� ���� float (��������� ������ ������ �������).
 *  ����� ��������� �������� "for" ������� ��� �������� �� ����� � ����:
"��������" | "�������� 2" | "�������� 3" |  � ��.
����� ����� ����������� ������� �������������� �������� ���� ����������
 � ��������� �������� �� ����� � ����:
average value =  "�������� ������� � ��� ����������".

 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class Les3_1 {

	public static void main(String[] args) {
		System.out.println("������ ��������� ������� ������� �������������� �������� �������.");
		Scanner sc = new Scanner(System.in);
		int menu = 1;
		while (menu != 0) {

			try {

				System.out.println("\n\n������� \"1\" - ����� ��������� ������ �������.");
				System.out.println("������� \"2\" - ����� ��������� ������ ���������� �������.");
				System.out.println("������� \"0\" - ����� ��������� ������ ���������.");
				System.out.println("--------------------------\n\n");

				menu = sc.nextInt();
				switch (menu) {
				case 1: {
					float[] arr = new float[10];
					for (int i = 0; i < arr.length; i++) {
						System.out.print("������� ��������� �������� �������� �������: ");
						arr[i] = sc.nextFloat();
					}
					float sum = 0;
					System.out.println("������ ����� ��������� ���:");
					for (int i = 0; i < arr.length; i++) {
						System.out.printf("%-8.3f", arr[i]);
						sum += arr[i];
					}
					System.out.printf("\n������� �������������� ��������� �������: " + "%-8.3f", (sum / arr.length), "\n");
					break;
				}
				case 2: {
					float[] arr = new float[10];
					for (int i = 0; i < arr.length; i++) {
						arr[i] = (float) (Math.random() * 10 + 1);
					}
					float sum = 0;
					System.out.println("������ ����� ��������� ���:");
					for (int i = 0; i < arr.length; i++) {
						System.out.printf("%-8.3f", arr[i]);
						sum += arr[i];
					}
					System.out.printf("\n������� �������������� ��������� �������: " + "%-8.3f", (sum / arr.length), "\n");
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
