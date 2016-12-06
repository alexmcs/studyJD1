package lesson4;

public class DelSymbolsRus {

	private String newAlphabet = " abcdefghijklmnopqrstuvwxyzабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
	private StringBuilder builder = new StringBuilder();

	public String delSymbols(String text) {

		String formatedText = text.toLowerCase();
		String newText;
		char[] charArr = formatedText.toCharArray();
		for (int i = 0; i < formatedText.length(); i++) {
			if (newAlphabet.indexOf(charArr[i]) != -1) {
				builder.append(charArr[i]);
			}
		}
		newText = builder.toString();
		return newText;

	}

}
