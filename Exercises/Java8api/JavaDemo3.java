package Java8api;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

import sun.security.pkcs11.wrapper.Functions;

public class JavaDemo3 {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

		System.out.println(values.stream().map(i -> i * 2).reduce(0, (a, e) -> a + e));
		
		
		Function<Integer, Integer> f = new Function<Integer, Integer>() {

			public Integer apply(Integer i) {
				return i * 2;
			}
		};//this is working the .map(i->i*2)
		BinaryOperator<Integer> b= new BinaryOperator<Integer>() {
			public Integer apply(Integer i, Integer j){
				return i+j;
			}
		};//
		Stream s= values.stream();
		
		Stream s1=s.map(f);
		 Integer result= (Integer)s1.reduce(0,b);
		 System.out.println(result);
		 //..........................................
		/* Function<Integer, Integer> f = new Function<Integer, Integer>() {

				public Integer apply(Integer i) {
					return i * 2;
				}
			};//this is working the .map(i->i*2)
			BinaryOperator<Integer> b= new BinaryOperator<Integer>() {
				public Integer apply(Integer i, Integer j){
					return i+j;
				}
			};//
*/			Stream s3= values.stream();
			
			Stream s4=s3.map(new Function<Integer, Integer>() {

				public Integer apply(Integer i) {
					return i * 2;
				}
			});
			 Integer s5= (Integer)s4.reduce(0,new BinaryOperator<Integer>() {
					public Integer apply(Integer i, Integer j){
						return i+j;
					}
				});
			 System.out.println(s5);

		
	}
}
