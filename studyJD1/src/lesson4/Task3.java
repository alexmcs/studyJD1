package lesson4;

/*
 * 3. Из текста удалить все слова заданной длины, начинающиеся на согласную
 * букву.
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class Task3 {

	public static void main(String[] args) {
		System.out.println(
				"This programm delete all words with the defined length and started with the consonant letter from the inputed text. ");
		Scanner sc = new Scanner(System.in);

		int menu = 1;
		String consonantLetters = "bcdfghjklmnpqrstvwxzбвгджзклмнпрстфхцчшщ";

		while (menu != 0) {
			try {
				System.out.println(
						"\n\nPress \"1\" - to input new text and to define the length of the words that should be deleted");
				System.out.println("Press \"0\" - to fin the programm.");
				System.out.println("--------------------------\n\n");

				menu = sc.nextInt();
				String text = new String();
				String[] words;
				int wordLength;

				switch (menu) {
				case 1: {
					char firstChar;
					String newText;
					StringBuilder builder = new StringBuilder();

					System.out.println("Input a new text.");
					sc.nextLine();
					text = sc.nextLine().toLowerCase();
					TextSpliter textSplit = new TextSpliter(text);
					words = textSplit.getWords();

					System.out.println("Define the length of the words, that should be deleted: ");
					wordLength = sc.nextInt();

					for (int i = 0; i < words.length; i++) {
						firstChar = words[i].charAt(0);
						if ((consonantLetters.indexOf(firstChar) != -1) & (wordLength == words[i].length())) {

						} else {
							builder.append(" ");
							builder.append(words[i]);
						}

					}
					newText = builder.toString();
					System.out.println(newText);

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
