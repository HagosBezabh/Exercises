package streamsandlamdaexpression1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSample1 {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub Integer[] arrOfInt = {1, 3, 5, 7};
		 * Stream<Integer> strOfInt = Stream.of(arrOfInt); List<Integer> list=
		 * strOfInt.collect(Collectors.toList()); System.out.println(list);
		 * 
		 * 
		 * Stream<String> song = Stream.of("gently", "down", "the",
		 * "stream").skip(2); List<String>
		 * strs=song.collect(Collectors.toList()); System.out.println(strs);
		 * 
		 * Stream<Character> combined = Stream.concat(("Hello"), ("World"));
		 * 
		 * Stream<Double> randoms = Stream.generate(Math::random).limit(10);
		 * 
		 * List<Double> db=randoms.collect(Collectors.toList());
		 * System.out.println(db);
		 * 
		 * //stream.limit(n) //stream.skip(n) //stream.concat(Stream)
		 */ List<String> list1 = new ArrayList<>();
		list1.add("Hagos");
		list1.add("bezabh");
		list1.add("haile");
		list1.add("kibrom");
		list1.add("haftom");
		list1.add("123456");
		final long count1 =
		// List<String> l=
		list1.stream().filter(w -> w.contains("H")).filter(w -> !w.contains("b")).filter(w -> w.length() == 5)// .collect(Collectors.toList());
				.count();

		System.out.println(count1);
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		List<Integer> strings = list.stream().map(x -> {
			if (x > 3)
				return 4;
			else
				return 5;
		}) // x is an Integer here
				.collect(Collectors.toList());
		System.out.println(strings);
	}

}
