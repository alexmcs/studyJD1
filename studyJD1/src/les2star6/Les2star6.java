package les2star6;

/*
 * 6*. �������� ���������, ������� ������� �� ����� �������� ������� � = 2�^2-5�-8 � ��������� �� -4 �� 4.
 *  ��� ��������� ��������� 0,5.
 */
import java.util.Scanner;
import java.util.InputMismatchException;


public class Les2star6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int menu = 1;
		System.out.println("������ ��������� ������� �� ����� �������� ������� � = 2�^2-5�-8 � ��������� �� -4 �� 4");
		
		while (menu !=0){
			System.out.println("\t������� \"1\" - ����� ��������� ���������;");
			System.out.println("\t������� \"0\" - ����� ��������� ���������.\n");
			
			try {
				menu = sc.nextInt();
				switch (menu){
				case 1:{
					int n = 4;
					System.out.println("x\ty");
					for (int i =(int) -n*2; i <=(int) n*2; i++){
						float x = (float) i/2;
						float y = 2*x*x - 5*x - 8;
						System.out.println(x + "\t" + y);
					}
					break;
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

		