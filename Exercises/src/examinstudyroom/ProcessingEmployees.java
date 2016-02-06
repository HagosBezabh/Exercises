package examinstudyroom;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProcessingEmployees
{
   public static void main(String[] args)
   {
      // initialize array of Employees
      Employee[] employees = {
         new Employee("Jason", "Red", 5000, "IT"),
         new Employee("Ashley", "Green", 7600, "IT"),
         new Employee("Matthew", "Indigo", 3587.5, "Sales"),
         new Employee("James", "Indigo", 4700.77, "Marketing"),
         new Employee("Luke", "Indigo", 6200, "IT"),
         new Employee("Jason", "Blue", 3200, "Sales"),
         new Employee("Wendy", "Brown", 4236.4, "Marketing")};

     //Q2a1
      System.out.println("2a1");
      System.out.printf("Total: %s%n", 
      Arrays.stream(employees)
      			.filter(e->e.getLastName().startsWith("B"))
      			.count());
       //2a2
      System.out.println("2a2");
      List<Employee> emp=Arrays.asList(employees);
      emp.stream()
		.filter(e->e.getLastName().startsWith("B"))
		.sorted(Comparator.comparing(Employee::getLastName))
		.forEach(System.out::println);
      //2a3
      System.out.println("2a3");
      emp.stream()
      		.filter(e->e.getLastName().startsWith("B"))
      		.map(e->new Employee(e.getFirstName(),e.getLastName().toUpperCase(),
      		e.getSalary(),e.getDepartment()))
      		.forEach(e->System.out.println(e));
      System.out.println("2a4");
      emp.stream()
		.filter(e->!e.getLastName().startsWith("B"))
		.map(e->new Employee(e.getFirstName(),e.getLastName(),
		e.getSalary(),e.getDepartment()))
		.forEach(System.out::println);
      
      emp.stream()
		.filter(e->e.getLastName().startsWith("B"))
		.map(e->new Employee(e.getFirstName().toUpperCase(),e.getLastName().toUpperCase(),
		e.getSalary(),e.getDepartment()))
		.forEach(e->System.out.println(e));
      System.out.println("2a5");
      emp.stream()
      	 .filter(e->e.getLastName().startsWith("I"))
      	 .map(e->e.getLastName().toUpperCase())
      	 .distinct()
      	 .forEach(System.out::println);
      System.out.println("2a6");
      System.out.println(emp.stream()
    	      	 .mapToDouble(e->e.getSalary())
    	      	 .average()); 	 
    	double i=
    	  emp.stream()
      	 .mapToDouble(e->e.getSalary())
      	 .average().getAsDouble();
      System.out.println("2a7");
      System.out.println(emp.stream()
    		  				.mapToDouble(Employee::getSalary)
    		  				.reduce(0,(x,y)->x+y));
      System.out.println("2a8");
      emp.stream()
      	 .map(e->e.getFirstName())
      	 .forEach(System.out::println);
      System.out.println("2a9");
      IntStream.iterate(0,h->h+2).limit(3).forEach(System.out::println);
      System.out.println("2a10");
     /* emp.stream()
        // .filter(e->new Employee(getLastName(),getFirstName(),))
         .map(e->e.getFirstName()+" "+e.getLastName())
         .forEach(System.out::println);*/
      IntStream.iterate(3, k -> k + 2)
        .limit(20)
        .forEach(System.out::println);
   } // end main
} // end class ProcessingEmployees
