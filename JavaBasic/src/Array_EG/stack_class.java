package Array_EG;

import java.util.Stack;

public class stack_class {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("A");
		s.push("B");
		System.out.println("Inserted array: " + s);
		String top = s.peek();
		System.out.println(top);
		s.pop();
		s.pop();
		System.out.println("Remove one element: " + s);
		s.push("A");
		s.push("B");
		System.out.println(s.search(1));
		while(!s.empty()) {
			System.out.println(s.pop());
		}
	}
}
