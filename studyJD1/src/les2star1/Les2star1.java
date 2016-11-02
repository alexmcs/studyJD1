package les2star1;
/*
 * �������� ���������, ������� �� ���� ���������� ���� ������, 
 * �� ������� ��� ���� ����������. ��� ���������� ��� ������ �������������� ��������:
 * (d+[1/5(13m-1)]+y+[y/4]+[c/4]-2c+777)mod7.
 * ���, d � ����� ������, m � ����� ������, ���� �������� ����
 *  � ����� (���� � 1, ������ � 2, ..., ������� � 12), Y � ����� ���� � ��������,
 *   � � ���������� ��������. ���������� ������ ��������, ��� ���� ����� �����
 *    ����� �� ��������, ������������ � �������. ����������� �� ������� ��������
 *     ���������� ���� ������: 1 � �����������, 2 � �������, ..., 6 � �������, 0 � �����������
 */

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.GregorianCalendar;

public class Les2star1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int menu = 1; //To manage the programm menu
		System.out.println("��� ��������� ��������� ���� ������ �� ��������� ����.\n");
		int data = 1;
		String month = "������";
		int year = 2000;
				
		while (menu !=0){
			System.out.println("\t����: " + data + "; �����: " + month + "; ���: " + year +"\n");
			System.out.println("\t������� \"1\" - ����� �������� ����;");
			System.out.println("\t������� \"2\" - ����� �������� �����;");
			System.out.println("\t������� \"3\" - ����� �������� ���;");
			System.out.println("\t������� \"0\" - ����� ��������� ���������.\n");
			
			try {
				menu = sc.nextInt();
				WeekDay wd = new WeekDay(data,month,year);
				switch (menu){
				case 1:{
					System.out.print("������� ����� ����: ");
					data = sc.nextInt();
					//WeekDay wd = new WeekDay(data,month,year);
					System.out.println(wd.dayOfWeek(data,month,year));
					break;
				}
				case 2:{
					System.out.print("������� ����� �����: ");
					try {
						month = sc.next();
						System.out.println(wd.dayOfWeek(data,month,year));
						break;
					}
					catch (ArrayIndexOutOfBoundsException exception){
						System.out.println("�� ����� ������������ ������. ����������, �������� �����!");
						break;
					}
				}
				case 3:{
					System.out.print("������� ����� ���: ");
					year = sc.nextInt();
					System.out.println(wd.dayOfWeek(data,month,year));
					break;
				}
				case 0:{
					System.out.println("������ ��������� ���������.");
					System.exit(1);
				}
				default:{
					System.out.println("����������, �������� �����");
					break;
				}
				}
			}
			catch (InputMismatchException exception){
				System.out.println("�� ����� ������������ ������. ������������� ���������");
				break;
			}
			
		}
		sc.close();
	}

}
