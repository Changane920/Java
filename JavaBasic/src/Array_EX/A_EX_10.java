package Array_EX;

public class A_EX_10 {
    static int temp = 1; 
	public static void main(String[] args) {
        int[] array = {3,4,5,10,4,5,11,10};
        for(int i = 0; i < array.length; i++){
           temp = array[i];
           for(int j = 0; j < i; j++) {
        	   if(temp == array[j]) {
        		   System.out.println(array[j] + " has a duplicate element.");
        	   }
           }
        }
        
        String[] str_array = {"Apple", "Banna", "Pineapple", "Orange"};
        boolean flag = false;
        
        for(int i = 0; i < str_array.length; i++) {
        	for(int j = i + 1; j < str_array.length; j++) {
        		if(str_array[j] == str_array[i]) {
        			flag = true;
        		}
        	}
        }
        
        if(flag) {
        	System.out.println("This array has the duplicate element.");
        }
        else {
        	System.out.println("This array hasn't the duplicate element.");
        }
	}
}
