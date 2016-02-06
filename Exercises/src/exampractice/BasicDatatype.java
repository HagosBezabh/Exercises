package exampractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BasicDatatype {

	public static void main(String[] args) {

		int[] arrs = {60, 12, 1, 2, 45, 4, 7, 87, 1, 45, 1 };

		long count =  IntStream.of(arrs).count();

		System.out.println(count);

		int sum =  IntStream.of(arrs).sum();
		double average = IntStream.of(arrs).average().getAsDouble();
		int min = IntStream.of(arrs).min().getAsInt();
		int max = IntStream.of(arrs).max().getAsInt();
		int reduce = IntStream.of(arrs).reduce(0, (a, b) -> a + b);
		int reduce2 = IntStream.of(arrs).reduce(1, (a, b) -> a * b);// Associative
																	// property

		OptionalInt k = IntStream.of(arrs).filter(e -> e % 3 == 0).findAny();
		OptionalInt h = IntStream.of(arrs).filter(e -> e % 3 == 0).findFirst();
		//OptionalInt j = IntStream.of(arrs).filter(e -> e % 3 == 0).findLast();
		
		System.out.println(k);
		IntStream range = IntStream.range(2, 10);
		IntStream closedRange = IntStream.rangeClosed(2, 10);
		
		range.forEach(System.out::print);
		System.out.println();
		closedRange.forEach(System.out::print);
		
		IntStream.of(arrs).filter(e->e%2 !=0).map(e->e*10).sorted().forEach(System.out::println);
		

	}

}
