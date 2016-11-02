package les2star2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 2*. �������� ���������, ������� ��������� ����� ������ n ������ ����:
 *  1 + 1/2 + 1/3 + 1/4 +�. ���������� ����������� ������ ���� ��������
 *   �� ����� ������ ���������.

 */

public class Les2star2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int menu = 1;
		System.out.println("������ ��������� ��������� ����� ������ n ������ ����:");
		System.out.println("1 + 1/2 + 1/3 + 1/4 +�.\n");
		
		while (menu !=0){
			System.out.println("\t������� \"1\" - ����� ������� n - ���������� ������ ����;");
			System.out.println("\t������� \"0\" - ����� ��������� ���������.\n");
			
			try {
				menu = sc.nextInt();
				switch (menu){
				case 1:{
					System.out.print("�������� n: ");
					int n = sc.nextInt();
					if (n > 0){
						double sum = 0;
						for (int i=1; i<=n; i++){
							sum +=(double) 1/i;
						}
						System.out.println("����� " + n + " ������ ������ ��������: " + sum);
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
		

	}

}
