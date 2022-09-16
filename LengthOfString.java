package videoByLAO;

public class LengthOfString {
	
	public static void withLengthFunction() {
		String s = "Prakash";
		System.out.println(s.length());
	}
	
	@SuppressWarnings("unused")
	public static void withoutLengthFunction() {
		String s = "Prakash";
		char[] charArray = s.toCharArray();
		int length = 0 ;
		for (char c : charArray)
			length++;
		System.out.println(length);
	}
	public static void main(String[] args) {
		
		withLengthFunction();
		withoutLengthFunction();
	}

}
