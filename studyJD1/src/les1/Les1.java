package les1;
/*
Используя java.util.Scanner написать программу, которая принимает на вход имя
пользователя, и сразу же его выводит в виде «Привет, пользователь!»
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