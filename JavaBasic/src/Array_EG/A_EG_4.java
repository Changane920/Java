package Array_EG;

public class A_EG_4 {
	public static void main(String[] args) {
		int[] array = {0,1,2,3,4,5};
		evenIndex(array);	
	}
	
	static void evenIndex(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(i%2 == 0) {
				System.out.println("Even index");
				System.out.println(arr[i] + " ");
			}
			else {
				System.out.println("Odd odd");
				System.out.println(arr[i] + " ");
			}
			
			
		}
	}
}
