public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int lettersToFive(String sentence, char letter) {
		int count = 0;
		for (int i = 0; i < sentence.length(); ++i) {
			if (sentence.charAt(i) == letter) ++count;
			if (count == 5) return i + 1;
		}
		return -1;
	}


	public static int countLetter(String sentence, char letter) {
		int count = 0;
		for (int i = 0; i < sentence.length(); ++i) {
			if (sentence.charAt(i) == letter) 
			++count;
		}
		return count;
	}

	
	public static int oddSum(int first, int last) {
		int actualFirst = Math.min(first, last), actualLast = Math.max(first, last);
		if (actualFirst%2 == 0) {
		++actualFirst;
	}
		if (actualLast%2 == 0) {
		--actualLast;
	}
		return (actualLast - actualFirst + 2)*(actualLast + actualFirst)/4;
	}

}
