package Recursive_EG;

public class R_Bin_Num {
	public static void main(String[] args) {
		int num = R_Bin_Nums(7);
		System.out.println(num);
	}

	private static int R_Bin_Nums(int num) {
		if(num <= 1) {
			return 1;
		}
		else {
			return R_Bin_Nums(num/2) + 1;			
		}
	}
	
}
