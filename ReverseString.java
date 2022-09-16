package videoByLAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {

	public static void usingBuffer() {

		String given = "Prakash";
		StringBuffer buffer = new StringBuffer();
		buffer.append(given);
		System.out.println(buffer.reverse());
	}

	public static void usingOwnLogic() {
//		String given = "Prakash";
//		char[] charArray = given.toCharArray();
//		String reversed = "";
//		for (int i = charArray.length - 1; i >= 0; i--) {
//			reversed += charArray[i];
//		}
//		System.out.println(reversed);
		String given = "Prakash";
		String reversed = "";
		for (int i = given.length()-1; i >= 0; i--) {
			reversed += given.charAt(i);
		}
		System.out.println(reversed);
	}

	public static void usingCollections() {
		String given = "Prakash";
		char[] charArray = given.toCharArray();
		List<Character> list = new ArrayList<>();
		for (char x : charArray) {
			list.add(x);
			// System.out.println(x);
		}
		Collections.reverse(list);
		ListIterator<Character> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
		}

	}

	public static void main(String[] args) {

		usingBuffer();
		usingOwnLogic();
		usingCollections();
	}

}




