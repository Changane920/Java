package FL_EX;

public class FL_EX_5 {
	public static void main(String[] args) {
		//a to z
		for(char ch = 'a'; ch <= 'z'; ch++) {
			if(ch == 'z') {
				System.out.println(ch);
			}
			else {
				System.out.print(ch + ",");				
			}
		}
	}
}
