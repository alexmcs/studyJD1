package les2star5;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 5*. �������� ��������� ���������� ����� ����� �� 1 �� n.
 */

public class Les2star5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int menu = 1;
		System.out.println("������ ��������� ��������� ����� ����� �� 1 �� ���������� �����");
		
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
						long sum = 1;
						for (int i=1; i<=n; i++){
							sum = sum + i;
						}
						System.out.println("����� ����� �� 1 �� " + n + " ����������: " + sum);
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
