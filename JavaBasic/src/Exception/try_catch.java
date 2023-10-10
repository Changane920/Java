package Exception;

public class try_catch {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		try {
			a[4] = 12;
		}
		catch(Exception e){
			System.out.println("Something wrong.");
			e.printStackTrace();
		}
		finally {
			System.out.println("Finish");
		}
	}
}
