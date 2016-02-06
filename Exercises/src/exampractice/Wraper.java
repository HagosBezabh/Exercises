package exampractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Wraper {
	public static void main(String[] args) {

		Integer[] arrs = { 12, 5, 6, 89, 56 };

		List<Integer> list = Arrays.asList(arrs);

		List<Integer> intList = list.stream().filter(n -> n > 8).sorted()
				.collect(Collectors.toList());
		System.out.println(intList);

		System.out.println(list.stream().count());
		System.out.println(list.stream().mapToInt(e -> e).sum());
		System.out.println("=============================================");
		System.out.println(list.stream().mapToInt(e -> e).min().getAsInt());
		System.out.println("=============================================");
		System.out.println(list.stream().mapToInt(e -> e).max());
		System.out.println(list.stream().mapToDouble(e -> e).average());
		System.out.println(list.stream().mapToInt(e -> e).reduce(0, (x, y) -> x + y));
		System.out.println(list.stream().findFirst());
		System.out.println(list.stream().findAny());
		System.out.println(list.stream().mapToInt(e->e).filter(e->e%3==0).count());
		
		
	}
}
