import java.util.Arrays;
public class PracticeProblem {

	public static void main(String args[]) {
		
	}
//Question 1
public static int[] compareSearch(int[] array, int number) {
//Sequential Search
	int seqCount = 0;
	for (int i = 0; i < array.length; i++) {
		seqCount++;
		if (array[i] == number) {
			break;
		}
	}
	Arrays.sort(array);
	int low = 0;
	int binCount = 0;
	int high = array.length - 1;
	while (low <= high) {
		binCount++;
		int middlePosition = (low + high) / 2;
		int middleNumber = array[middlePosition];
		if (number == middleNumber) {
			break; }
			if (number < middleNumber) {
				high = middlePosition - 1;
			}
			else {
				low = middlePosition + 1;
			}
			}
		return new int[] {seqCount, binCount};
	}
	//Question 2
	public static int[] compareStringSearch(String[] array, String word) {
	//Sequential Search
		int seqCount = 0;
		for (int i = 0; i < array.length; i++) {
			seqCount++;
			if (array[i].equalsIgnoreCase(word)) {
				break;
			}
		}
		Arrays.sort(array);
		int low = 0;
		int binCount = 0;
		int high = array.length - 1;
	
		while (low <= high) {
			binCount++;
			int middlePosition = (low + high) / 2;
			int middleNumber = array[middlePosition].compareTo(word);
			if (middleNumber == 0) {
				break; }
				if (middleNumber < 0) {
					low = middlePosition + 1;
				}
				else {
					high = middlePosition - 1;
				}
				}
			return new int[] {seqCount, binCount};
		}
	}