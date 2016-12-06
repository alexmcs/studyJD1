package lesson4;

/*5. Для двух строк напишите метод, определяющий, является ли одна строка перестановкой другой.
*/
import java.util.Scanner;
import java.util.InputMismatchException;

public class Task5 {

	public static void main(String[] args) {
		System.out.println("This programm compare two inputed texts. Does one of them is the mix of another.");
		Scanner sc = new Scanner(System.in);

		int menu = 1;

		while (menu != 0) {
			try {
				System.out.println("\n\nPress \"1\" - to input new texts.");
				System.out.println("Press \"0\" - to fin the programm.");
				System.out.println("--------------------------\n\n");

				menu = sc.nextInt();

				switch (menu) {
				case 1: {
					char symbol;

					String text1;
					String text2;
					String tempText;
					boolean comparing = false;

					System.out.println("Input the first text: ");
					sc.nextLine();
					text1 = sc.nextLine().toLowerCase();

					System.out.println("Input the second text: ");
					// sc.nextLine();
					text2 = sc.nextLine().toLowerCase();
					tempText = text2;

					if (text1.length() != text2.length()) {
						System.out.println("Second text isn't a mix of the first one!");
					} else {
						for (int i = 0; i < text1.length(); i++) {
							symbol = text1.charAt(i);
							StringBuilder builder = new StringBuilder(tempText);
							int num = tempText.indexOf(symbol);
							if (num == -1) {
								System.out.println("Second text isn't a mix of the first one!");
								break;
							}
							builder.deleteCharAt(num);
							tempText = builder.toString();
							if (i == (text1.length() - 1)) {
								comparing = true;
							}
						}
						if (comparing) {
							System.out.println("Second text is a mix of the first one!");
						}
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
