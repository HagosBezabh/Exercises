package streamsandlamdaexpression1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streamexample {
	public static void main(String[] args){
		//String[] list={"hagos","bezabh","haile","hb"};
		List<String> list1=new ArrayList<>();
		list1.add("Hagos");
		list1.add("bezabh");
		list1.add("haile");
		list1.add("kibrom");
		list1.add("haftom");
		list1.add("123456");
		int count = 0;
		for(String word : list1) {
		     if(word.length() > 5) 
		         count++;
		}
		System.out.print("The no of Ele:"+count);
		
		//System.out.print("\nThe no of Ele:"+count);
		
		final long count1 = list1.stream().filter(w -> w.length() > 5).count();
		System.out.print("\nThe no of Ele:"+count);
		final long count2 = list1.parallelStream().filter(w -> w.length() > 5).count();
		System.out.print("\nThe no of Ele:"+count);
		System.out.print("\nthe 2 elements :");
		List<String> l=list1.stream().filter(w -> w.length() > 6).limit(2).
				collect(Collectors.toList());
		System.out.println(l);
		//System.out.println( list1.stream().filter(w -> w.length() > 5).limit(2));
	final long k=	list1.stream().filter(w -> w.length() > 6).limit(2).count();
	System.out.println(k);
		
	}
}
