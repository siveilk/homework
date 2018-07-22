package Homeworks123;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		System.out.println("Please enter a natural number. Enter 0 to exit.");
		for (boolean go = true; go == true;) {
			System.out.print("Base's length: ");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			if (n == 0) {
				sc.close();
				go = false;
			}
			for (int line = 0;; line++) {
				int starsInLine = n % 2 + 2 * line;
				if (starsInLine > n)
					break;
				if (starsInLine != 0) {

					for (int i = 1; i <= n / 2 - line; i++)
						System.out.print(" ");

					for (int s = 1; s <= starsInLine; s++)
						System.out.print("*");

					System.out.println();
				}
			}
		}
	}

}
