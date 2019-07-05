package Q1_01_Is_Unique;

public class QuestionA {
	public static boolean isUniqueChars(String str) {
		if (str.length() > 128) {
			return false;
		}
		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) return false;
			char_set[val] = true;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));
		}
	}

}
class Node {
Node next = null;
int data;
	public Node( int d) {
	 data = d;
	 }

	 void appendToTail(int d) {
	 Node end = new Node(d);
	 Node n = this;
	 while (n.next != nUll) {
		 n = n.next;
		 }
		 n. next = end;
	}
}

