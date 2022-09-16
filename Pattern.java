package videoByLAO;

import java.util.Scanner;

public class Pattern {

	public static void star() {

		int numOfLines = 0;
		int row, col = 0;
		System.out.println("Enter the no of lines: ");
		Scanner sc = new Scanner(System.in);
		numOfLines = sc.nextInt();

		for (row = 0; row < numOfLines; row++) {
			for (col = 0; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void number() {

		int startingNum = 1;
		int row, col = 0;
		System.out.println("Enter the limit: ");
		Scanner s = new Scanner(System.in);
		int limit = s.nextInt();

		for (row = 0; row < limit; row++) {
			for (col = 0; col <= row; col++) {
				System.out.print(startingNum + " ");
				startingNum++;
			}
			System.out.println();
		} 
 
	}
 
	public static void main(String[] args) {

		 star();
		number();
	}

}
