package GenericProgramming;

import java.util.ArrayList;
import java.util.List;

public class NumberOfOccurrances {
	public static void main(String[] args){
		System.out.println("No of occurrances of a target String");
		String[] arr={"hagos","kb","haftom","haftom"};
		System.out.println(countOcurrances(arr, "haftom"));
		
		System.out.println("Max fro list of Integers");
		List<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println("The list of nos is");
		System.out.println(list);
		System.out.println("The max element from the elements of the list");
		System.out.println(max(list));
		
	}
	public static<T,E> int countOcurrances(T[] arr, E target){
		int count=0;
		if(target==null){
			for(T item:arr){
				if(item==null)
					count++;
			}
		}
		else{
			for(T item:arr){
				if(item.equals(target))
					count++;
			}
		}
		return count;
	}
	/*public static Integer max(List<Integer> list){
		Integer max=list.get(0);
		for(Integer i:list){
			if(i.compareTo(max)>0){
				max=i;
			}
		}
		return max;
	}*/
	public static <T extends Comparable> T max(List<T> list){
		T max=list.get(0);
		for(T i:list){
			if(i.compareTo(max)>0){
				max=i;
			}
		}
		return max;
	}

}
