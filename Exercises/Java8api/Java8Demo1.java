package Java8api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8Demo1 {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

		System.out.println("1.====================================================");
		Consumer<Integer> c = new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.print(i);
			}
		};
		values.forEach(c);
		System.out.println("\n2.====================================================");
		Consumer<Integer> cc = i -> System.out.print(i);
		values.forEach(c);
		System.out.println("\n3.====================================================");
		// here is in shorter way"
		values.forEach(i -> System.out.print(i));
		System.out.println("\n4.====================================================");

		values.forEach(new Consumer<Integer>() 
		{
			public void accept(Integer i) 
			{
				System.out.print(i);
			}
		});
		System.out.println("\n====================================================");

	}
}
