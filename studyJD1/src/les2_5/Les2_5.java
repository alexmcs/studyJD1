package les2_5;
/*
 * 5. �������� ���������, ������� ��������� ����������� ��� ��� ������������,
 *  ���������� ��� � �������� � ������ ������������ � �������������
 *   ����������� ��� ��������. ����������� ��� ����������� �� �������:
 *    ���� (��) � 100.
 */
import java.util.Scanner;
import java.util.InputMismatchException;
import static java.lang.Math.*;

public class Les2_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("������� ��� ��� � ��: ");
			double weight = sc.nextDouble();
			System.out.println("������� ��� ���� � ��: ");
			double height = sc.nextDouble();
			double optimalWeight = height - 100; //Optimal weight calculation
			double aberration = (abs(weight - optimalWeight)/optimalWeight); // Calculation of deviation from optimal weight. In percentage.
			if ((aberration*100) <= 1){
				System.out.println("� ��� ����������� ���!");
			}
			else if ((aberration*100) <= 7){
				System.out.println("� ��� ��������� �������� � �����.");
				if (weight < optimalWeight)
					System.out.println("��� ������� ������� ����� " + round(optimalWeight - weight) + "��.");
				else
					System.out.println("��� ������� ������� ����� " + round(weight - optimalWeight) + "��.");
			}
			else {
				System.out.println("� ��� ��������� �������� � �����.");
				if (weight < optimalWeight)
					System.out.println("������������ ���������� ��� ������� �� ����� " + round(optimalWeight - weight) + "��.");
				else
					System.out.println("������������ ���������� ��� ������� �� ����� " + round(weight - optimalWeight) + "��.");
			}
		}
		catch (InputMismatchException exception){
			System.out.println("");
		}
		sc.close();
	}

}
