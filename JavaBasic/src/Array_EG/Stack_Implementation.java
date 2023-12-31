package Array_EG;

public class Stack_Implementation {
	static String[] str = new String[5];
	static int top = -1;
	public static void main(String[] args) {
		System.out.println("Data entered: ");
		push("A");
		push("B");
		push("C");
		push("D");
		push("E");
		pop();
		
		printArray();
	}
	static void push(String s) {
		str[++top] = s;
		if(isFull()) {
			System.out.println("Overflow");
			System.exit(1);
		}
	}
	static void pop() {
		if(isEmpty()) {
			System.out.println("Underflow");
			System.exit(1);
		}
		--top;
	}
	static boolean isFull() {
		if(top > str.length - 1) {
			return true;
		}
		else {
			return false;
		}
	}
	static boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	static void printArray() {
		for(int i = 0; i <= top; i++) {
			System.out.print(str[i] + " ");
		}
	}
}
