
public class PigLatinTranslator {
	private String englishInput;
	private String[] words;
	private String pigLatinOutput;
	
	
	public PigLatinTranslator(String englishInput) {
		this.englishInput = englishInput;
	}


	public String getEnglishInput() {
		return englishInput;
	}


	public void setEnglishInput(String englishInput) {
		this.englishInput = englishInput;
	}


	public String[] getWords() {
		return words;
	}


	public void setWords(String[] words) {
		this.words = words;
	}


	public String getPigLatinOutput() {
		return pigLatinOutput;
	}


	public void setPigLatinOutput(String pigLatinOutput) {
		this.pigLatinOutput = pigLatinOutput;
	}
	
	public String translate() {
		convertToLowerCase();
		parseStringToArray();
		removePunctuation();
		for (String s: words) {
			if (startsWithVowel(s)) {
				s+="way";
			} else if (!startsWithVowel(s)) {
				int i = s.indexOf("");
				
			}

		}
		return pigLatinOutput;
	}
	
	private void convertToLowerCase() {
		englishInput = englishInput.toLowerCase();
	}
	private void parseStringToArray() {
		words = englishInput.split(" ");
	}
	private void removePunctuation() {
		for (String s: words) {
			// remove commas periods and exclamation points from all string s in the array words.
			if (s.endsWith(".")||s.endsWith("!")||s.endsWith(",")||s.endsWith("?")) {
				int l = s.length();
				s = s.substring(0, l-1);
			
				
			}
		}
	} 
	private boolean startsWithVowel(String s) {
		boolean startsWithVowel = false;
			if (s.startsWith("a")|| s.startsWith("e")
				||s.startsWith("i")||s.startsWith("o")||s.startsWith("u")) {
				s+="way"; 
			}
		
		else if (!s.startsWith("a")|| !s.startsWith("e")
		||!s.startsWith("i")||!s.startsWith("o")||!s.startsWith("u")) {
			startsWithVowel = true;

		}
			return startsWithVowel;
	}
	private int indexOfFirstVowel(String s) {
		int i = 0;
		
		
		return i;
	}

}
