package les1;
/*
��������� java.util.Scanner �������� ���������, ������� ��������� �� ���� ���
������������, � ����� �� ��� ������� � ���� �������, ������������!�
 */
import java.util.Scanner;
public class Les1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			System.out.println("What is your name? ");
			sc.hasNextLine();
			String name = sc.nextLine();
			System.out.println("Hello, " + name);
		sc.close();
		}

	}