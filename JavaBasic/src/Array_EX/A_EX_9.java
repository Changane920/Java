package Array_EX;

public class A_EX_9 {
	public static void main(String[] args) {
		int[] array = new int[100];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random()*100 + 10000000);
		}
		for(int i : array) {
			System.out.println(i);
		}
	}
}
