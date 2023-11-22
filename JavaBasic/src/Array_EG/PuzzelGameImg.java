package Array_EG;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PuzzelGameImg {
	public static void main(String[] args) {
		Integer[] array = {1,2,3,4,5,6,7,8,9};
		List<Integer> numList = Arrays.asList(array);
		Collections.shuffle(numList);
		for(Integer i : numList) {
			System.out.println(i);
		}
	}
}
