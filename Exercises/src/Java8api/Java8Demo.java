package Java8api;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// External iterations..........................
public class Java8Demo {
	public static void main(String[] args){
		List<Integer> values=  Arrays.asList(1,2,3,4,5,6);
		/*//using normal for loop
		for(int i=0;i<6;i++)
		{
			System.out.println(values.get(i));
		}
		
		//using enhanced for loop
		for(int i:values)
		{
			System.out.println(i);
		}
		
		//using Iterator
		Iterator<Integer> j= values.iterator();
		while(j.hasNext()){
			System.out.println(j.next());
		}
		//In the above three cases we were applying external loops to do the iteration
		
		//lets use internal for loops
		*/
		values.forEach(i->System.out.println(i));
		//forEach is a method that takes a method of Consume interface.....
		//i->System.out.println(i) this is functional interface............
		//
	}
}
