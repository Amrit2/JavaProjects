package exercises;

import java.util.Arrays;

public class NumberList {
	private final int max = 10; // use FINAL max to set the length of array
	private int[] numbers;

	public NumberList() {
		initialiseArray();
	}

	public void initialiseArray() {
		this.numbers = new int[max];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 0;
		}
	}

	public int size() {
		return numbers.length;
	}

	private boolean valid(int index) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] <= index) {
				return true;
			}
		}
		return false;
	}

	private void update (int i, int value) {
		if(valid(i))
		{
			this.numbers[i] = value;
		}
	}

	private int min() {
		int minNumber = numbers[0];
		for (int i = 0; i <numbers.length; i++) {
			if (numbers[i] < minNumber) {
				minNumber = numbers[i];
			}
		}
		return minNumber;
	}

	private int max() {
		int maxNumber = numbers[0];
		for (int i = 0; i <numbers.length; i++) {
			if (numbers[i] > maxNumber) {
				maxNumber = numbers[i];
			}
		}
		return maxNumber;
	}

	private int nonZero() {
		int total = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != 0) {
				total++;
			}
		}
		return total;
	}

	private double average() {
		int sum = 0;
		for (int i = 0; i< numbers.length; i++) {
			sum += numbers[i];
		}
		return sum/numbers.length;
	}

	private int getNumber(int i) {
		int number = 0;
		for (int j = 0; j < numbers.length; j++) {
			if (i == j) {
				number= numbers[i];
			}
		}
		return number;
	}

	private void absolute() {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				numbers[i] = numbers[i]*-1;
			}
		}
	}

	private void scale (int factor) {
		for (int i= 0; i < numbers.length; i++) {
			numbers[i] = numbers[i] * factor;
		}
	}

	private NumberList sub (int startIndex, int endIndex) {
		NumberList list = new NumberList();
		if(valid(startIndex)&&valid(endIndex))
		{
			int count = 0;
			for (int i = startIndex; i <= endIndex; i++) {
				list.update(count++, this.getNumber(i)); 
			}
		}
		return list;
	}

	public String toString() {
		return Arrays.toString(numbers);
	}
}
