package lesson4;

/*4. Реализуйте алгоритм, определяющий, все ли символы в строке встречаются один раз.*/
import java.util.Scanner;
import java.util.InputMismatchException;

public class Task4 {

	public static void main(String[] args) {
		System.out.println("This programm check the inputed text. Does every sybmol in text is unique.");
		Scanner sc = new Scanner(System.in);

		int menu = 1;

		while (menu != 0) {
			try {
				System.out.println("\n\nPress \"1\" - to input new text.");
				System.out.println("Press \"0\" - to fin the programm.");
				System.out.println("--------------------------\n\n");

				menu = sc.nextInt();

				switch (menu) {
				case 1: {
					char symbol;
					char repeatedSymbol = ' ';
					String text;
					String tempText;
					boolean check = false;

					System.out.println("Input the text: ");
					sc.nextLine();
					text = sc.nextLine().toLowerCase();
					
					for (int i = 0; i < text.length(); i++) {
						StringBuilder builder = new StringBuilder(text);
						symbol = builder.charAt(i);
						builder.deleteCharAt(i);
						tempText = builder.toString();
						
						if (tempText.indexOf(symbol) != -1) {
							repeatedSymbol = symbol;
							check = true;
							break;

						}

					}
					if (check) {
						System.out.println("There is a repeating symbol: " + repeatedSymbol);

					} else {
						System.out.println("All symbols in text are unique!");
					}

					break;
				}

				case 0: {
					System.out.println("The programm is fin.");
					System.exit(1);
					break;
				}
				default: {
					System.out.println("Make your choise.");
					break;
				}
				}

			} catch (InputMismatchException exception) {
				System.out.println("Inputed data are incorrect! Restart the programm.");
				System.exit(1);
			}
		}
		sc.close();
	}

}
