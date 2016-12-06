package lesson4;

public class TextSpliter {
	// this class splits the text into words

	private String text;
	private String[] words;
	private int[] spaceIndexes;
	private int textLength;
	private int wordCount;
	private DelSymbolsRus delSymb = new DelSymbolsRus();

	public TextSpliter(String s) {
		// constructour for the class
		text = delSymb.delSymbols(s); //to del different symbols in the text
		textLength = text.length();
		spaceIndexes = spaceFiller(text);
		words = wordsFiller();
	}

	private int[] spaceFiller(String text) {
		// to fix the spaces indexes in the text + 1st position + last position
		int n = 0;
		char symbol;
		for (int i = 0; i < textLength; i++) {
			symbol = text.charAt(i);
			if (symbol == ' ') {
				n++;
			}
		}
		n = n + 2;
		wordCount = n - 1;
		int[] spaceCount = new int[n];
		spaceCount[0] = 0;
		int j = 1;
		for (int i = 0; i < textLength; i++) {
			symbol = text.charAt(i);
			if (symbol == ' ') {
				spaceCount[j] = i;
				j++;
			}
		}

		spaceCount[n - 1] = textLength;
		return spaceCount;
	}

	private String[] wordsFiller() {
		// to split the text into words

		String[] wordsFill = new String[wordCount];
		for (int i = 0; i < wordCount; i++) {
			if (i == 0) {
				wordsFill[i] = text.substring(spaceIndexes[i], spaceIndexes[i + 1]);
			} else {
				wordsFill[i] = text.substring(spaceIndexes[i] + 1, spaceIndexes[i + 1]);
			}
		}

		return wordsFill;
	}

	public String[] getWords() {
		return words;
	}

}
