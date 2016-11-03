package les2star3;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 3*. �������� ���������, ������� ��������� ��������� ���������� � ���������� �����.
 */

public class Les2star3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int menu = 1;
		System.out.println("������ ��������� ��������� ��������� ���������� �����");
		
		while (menu !=0){
			System.out.println("\t������� \"1\" - ����� ������ ����� �����;");
			System.out.println("\t������� \"0\" - ����� ��������� ���������.\n");
			
			try {
				menu = sc.nextInt();
				switch (menu){
				case 1:{
					System.out.print("�������� ����� ��� ������� ����������: ");
					int n = sc.nextInt();
					if (n > 0){
						long fac = 1;
						for (int i=1; i<=n; i++){
							fac = fac*i;
						}
						System.out.println("��������� �����  " + n + " ����������: " + fac);
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
