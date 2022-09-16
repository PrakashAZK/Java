package videoByLAO;

import java.util.Scanner;

public class RverseNumber {

	public static void main(String[] args) {

		int givenNo = 0;
		int reversedNo = 0;

		System.out.println("Enter your number: ");
		Scanner s = new Scanner(System.in);
		givenNo = s.nextInt();

		while (givenNo != 0) {
			// Formula
			reversedNo = reversedNo * 10;
			reversedNo = reversedNo + givenNo % 10;
			givenNo = givenNo / 10;
		}
		System.out.println(reversedNo);

		s.close();
	}

}
