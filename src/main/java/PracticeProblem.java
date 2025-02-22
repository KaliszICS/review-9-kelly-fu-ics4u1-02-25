public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int lettersToFive(String sentence, char letter) {
		int count = 0;
		for (int i = 0; i < sentence.length(); ++i) { // i is the index of the letter
			// ”aaa“ "a"
			if (sentence.charAt(i) == letter) ++count; // if character at index i is the letter we want
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
		// int count = 0;
		// for asldfjsalkdfj [5, 10] checks 4 5 6 7 8 9 10 11 12
		// 11 5
		// if (num%2 == 1) count += num;
		// return count;

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
