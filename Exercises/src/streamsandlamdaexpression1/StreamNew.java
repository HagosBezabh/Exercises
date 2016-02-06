package streamsandlamdaexpression1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamNew {

	public static void main(String[] args) {
		List<Integer> ints=Arrays.asList(1,2,3,4,5);
		/*List<int[]> intArrs=ints.stream()
								.map(int[]::new)
								.collect(Collectors.toList());
		List<String> intStr=intArrs.stream()
							.map(Arrays::toString)
							.collect(Collectors.toList());
		System.out.println(intStr);
*/		//Stream<Stream<Character>> result = list.stream().map(s -> characterStream(s))
		Stream<String> uniqueWords
		= Stream.of("merrily", "merrily", "merrily", "gently").distinct();
		System.out.println();
		List<String> str=uniqueWords.collect(Collectors.toList());
		System.out.println(str);
		
		System.out.println("=====================================================");
		List<String> words = Arrays.asList("Tom", "Joseph", "Richard");
		Stream<String> longestFirst
		= words.stream().sorted((String x, String y) ->
		(new Integer(y.length()).compareTo(new Integer(x.length())))); //show how this
		//works with a concrete example like “hat” and “runner”
		System.out.println(longestFirst.collect(Collectors.toList()));
		
		//Stream<String> longestFirst
		System.out.println("=====================================================");
	}

}
