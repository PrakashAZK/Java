package videoByLAO;

public class SwapTwoNumbers {

	public static void withThirdVarible() {
		int mySalary = 10000;
		int superiorSalary = 15000;

		System.out.println("Before Swapping: " + "Mine: " + mySalary + " Superior: " + superiorSalary);

		int temp = mySalary;
		mySalary = superiorSalary;
		superiorSalary = temp;
		
		System.out.println();
		System.out.println("After Swapping: " + "Mine: " + mySalary + " Superior: " + superiorSalary);
	}
	
	public static void withoutThirdVariable() {
		int mySalary = 10000;
		int superiorSalary = 15000;

//		first =  first - second;
//		second =  second + first;
//		first = second - first;
//		
//		first =  first * second;
//		second =  first / second;
//		first = first / second;

//		System.out.println();
//		System.out.println("Before Swapping: " + "Mine: " + mySalary + " Superior: " + superiorSalary);
//		mySalary = mySalary - superiorSalary;
//		superiorSalary = superiorSalary + mySalary;
//		mySalary = superiorSalary - mySalary;
//		System.out.println();
//		System.out.println("After Swapping: " + "Mine: " + mySalary + " Superior: " + superiorSalary);
	 	
		System.out.println();
		System.out.println("Before Swapping: " + "Mine: " + mySalary + " Superior: " + superiorSalary);
		mySalary = mySalary * superiorSalary;
		superiorSalary = mySalary / superiorSalary;
		mySalary = mySalary / superiorSalary;
		System.out.println();
		System.out.println("After Swapping: " + "Mine: " + mySalary + " Superior: " + superiorSalary);
		
	}

	public static void main(String[] args) {
		//withThirdVarible();
		withoutThirdVariable();
	}

}
