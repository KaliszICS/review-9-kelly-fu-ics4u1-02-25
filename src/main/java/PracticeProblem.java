public class PracticeProblem {

	public static void main(String args[]) {

	}

	//1
	public static int lettersToFive(String word, char letter){
		int count = 0;
		int index = 0;
		while (index < word.length()){
			if (word.charAt(index) == letter){
				count++;
				if (count == 5){
				return index+1;
				}
			}
			index++;
		}
		return -1;
	}

	//2
	public static int countLetter(String word2, char letter2){
		int count2 = 0;
		for (int i = 0; i < word2.length(); i++){
			if (word2.charAt(i) == letter2){
				count2++;
			}
		}
		return count2;
	}
	
	//3
	public static int _oddSum_ (int a, int b){
		int sum = 0;
		int min = Math.min(a,b);
		int max = Math.max(a,b);
		for (int i = min; i <= max; i++){
			if (i % 2 == 0){
				sum += i;
			}
		}
		return sum;
	}



}