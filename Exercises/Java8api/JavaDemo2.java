package Java8api;

import java.util.Arrays;
import java.util.List;

public class JavaDemo2 {

	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		
		//values.forEach(i->doubleIt(i));
		values.forEach(JavaDemo2::doubleIt);

	}
	public static void doubleIt(Integer i){
		System.out.println(i*2);
	}

}
