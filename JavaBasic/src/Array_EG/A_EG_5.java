package Array_EG;

public class A_EG_5 {
	public static void main(String[] args) {
		int[] array = {0,1,2,3,4};
		uniqueArray(array);
	}
	
	static void uniqueArray(int[] arr) {
		boolean flag = true;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					flag = false;
				}
			}
		}
		if(flag) {
			System.out.println("Unique Array");
		}
		else {
			System.out.println("Not Unique Array");
		}
	}
}
