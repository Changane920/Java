import java.util.HashMap;

public class Hash_map {
	public static void main(String[] args) {
		HashMap<String, Integer> people = new HashMap<String, Integer>();
		
		people.put("Hello",0);
		people.put("Mandalay", 3);
		people.put("World!", 1);
		people.put("Myanmar", 5);
		people.put("Yangon", 4);
		people.put("A", 2);
		
		System.out.println(people);
		
		for(String p : people.keySet()) {
			System.out.println(p);
		}
		for(int p : people.values()) {
			System.out.println(p);
		}
	}
}
