package exampractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

import examinstudyroom.Employee;

public class Person {

	public static void main(String[] args) {

		Employee[] employees = { 
				new Employee("Jason", "Red", 5000, "IT"),
				new Employee("Ashley", "Green", 7600, "IT"),
				new Employee("Matthew", "Indigo", 3587.5, "Sales"),
				new Employee("James", "Indigo", 4700.77, "Marketing"), 
				new Employee("Luke", "Indigo", 6200, "IT"),
				new Employee("Jason", "Blue", 3200, "Sales"), 
				new Employee("Wendy", "Brown", 4236.4, "Marketing") };

		List<Employee> list = Arrays.asList(employees);
		// 1
		int count = (int) list.stream().filter(e -> e.getLastName().startsWith("B")).count();
		System.out.println("Count:" + count);
		// 2
		list.stream().filter(e -> e.getLastName().startsWith("B")).sorted(Comparator.comparing(Employee::getLastName))
				.forEach(System.out::println);

		// 3

		list.stream().filter(e -> e.getLastName().startsWith("B")).map(e -> new Employee(e.getFirstName().toUpperCase(),
				e.getLastName().toUpperCase(), e.getSalary(), e.getDepartment())).forEach(System.out::println);

		// 4

		list.stream().map(e -> {
			if (e.getLastName().startsWith("B"))
				return new Employee(e.getFirstName().toUpperCase(), 
						e.getLastName().toUpperCase(), e.getSalary(),
						e.getDepartment());
			else
				return e;
		}).forEach(System.out::println);

		// 5
		System.out.println("=I=========");
		list.stream().filter(e -> e.getLastName().startsWith("I")).map(e -> e.getLastName()).sorted().distinct()
				.forEach(System.out::println);

		// 6

		double average = list.stream().mapToDouble(e -> e.getSalary()).average().getAsDouble();
		System.out.println("Average Salary: " + average);

		// 7

		double totalSalary = list.stream().mapToDouble(e -> e.getSalary()).reduce(0, (a, b) -> a + b);
		System.out.println("Total Salary: " + totalSalary);

		// 8

		list.stream().map(e -> e.getFirstName()).forEach(System.out::println);

		// 9
		Stream<Integer> intStreams = Stream.iterate(0, n -> n + 2).limit(20);
		intStreams.forEach(System.out::println);

		// 10 find first

		Optional<Employee> first = list.stream().filter(e -> e.getLastName().startsWith("B"))
				.findFirst();
		System.out.println(first);

		Optional<Employee> findany = list.stream().filter(e -> e.getLastName().startsWith("B")).
				findAny();
		System.out.println(findany);

	}
//overriding equals method for Employee class
	/*public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (this.department.equals(other.department) && this.firstName.equals(other.firstName)
				&& this.lastName.equals(other.lastName) && this.salary == other.salary)
			return true;
		else
			return false;
	}*/
	public static long countWords(List<String> words, char c, char d, int len) {

		long count = 0;

		// count = words.stream().filter(e->e.length() == len && e.contains(""
		// +c) && !e.contains("" +d))
		// .count();
		count = words.stream().filter(e -> e.length() == len).filter(e -> e.contains("" + c))
				.filter(e -> !e.contains("" + d)).count();

		return count;
	}

}
