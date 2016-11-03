package les2star4;

/*
 * 4*. �������� ���������, ������� ������� ������� ��������� ������ ������ ����� ������������� ����� �� 0 �� 10
 */
import java.util.Scanner;
import java.util.InputMismatchException;


public class Les2star4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int menu = 1;
		System.out.println("������ ��������� ������� ������� ������������ ����� ����� �� ���������� �����");
		
		while (menu !=0){
			System.out.println("\t������� \"1\" - ����� ������ ����� �����;");
			System.out.println("\t������� \"0\" - ����� ��������� ���������.\n");
			
			try {
				menu = sc.nextInt();
				switch (menu){
				case 1:{
					System.out.print("�������� �����: ");
					int n = sc.nextInt();
					if (n > 0){
						for (int j = 1; j <= n; j ++){
							for (int i = 1; i <= n; i++){
								System.out.print(i*j + "\t");
							}
							System.out.print("\n");
						}
						break;
					}
					else {
						System.out.println("���������� ������ ������������� �����.");
						break;
					}
				}
				case 0:{
					System.out.println("������ ��������� ���������.");
					System.exit(1);
				}
				default:{
					System.out.println("����������, �������� ����� ����.");
					break;
				}
				}
			}
			catch (InputMismatchException exception){
				System.out.println("�� ����� ������������ ��������.");
				break;
			}
		}
		sc.close();
	}
}

		