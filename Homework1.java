package Homeworks123;

public class Homework1 {

	public static void main(String[] args) {
		int[] example = { 1, 5, 5, 5, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 5, 5, 5, 5, 5 };
		System.out.println(longest(example));
	}

	public static int longest(int[] a) {
		int theInt, length, maxLength, i;
		theInt = a[0];
		length = maxLength = 1;
		for (i = 1; i < a.length; i++) {
			if (a[i] == a[i - 1]) {
				length++;
			} else {
				if (length > maxLength) {
					maxLength = length;
					theInt = a[i - 1];
				}
				length = 1;
			}
		}
		if (length > maxLength)
			theInt = a[i - 1];
		return theInt;
	}
}
