package Array_EG;

public class A_EG_3 {
	public static void main(String[] args) {
		int[] array = {100,70,30,90,50};
		int result = maxArray(array);
		
		System.out.println("Largest number is " + result);
	}
	
	static int maxArray(int[] arr) {
		int num = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(num < arr[i]) {
				num = arr[i];
			}
		}
		return num;		
	}
}
