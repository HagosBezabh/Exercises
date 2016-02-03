package GenericProgramming;

import java.util.ArrayList;
import java.util.List;

public class Sample1 {
	public static void main(String[] args){
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
		//List<Number> nums = ints; //compiler error
		//nums.add(3.14);
		System.out.print(ints); //output: [1, 2, 3.14]
		//covariant
	}
}
