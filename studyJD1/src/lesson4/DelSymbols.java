package lesson4;

public class DelSymbols {
	// this class is needed to delete all symbols from the inputed text, besides
	// of English letters and spaces

	private String alphabet = " abcdefghijklmnopqrstuvwxyz";
	private StringBuilder builder = new StringBuilder();

	public String delSymbols(String text) {
		String formatedText = text.toLowerCase();
		String newText;
		char[] charArr = formatedText.toCharArray();
		for (int i = 0; i < formatedText.length(); i++) {
			if (alphabet.indexOf(charArr[i]) != -1) {
				builder.append(charArr[i]);
			}
		}
		newText = builder.toString();
		return newText;

	}

}
