package examinstudyroom;

public class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	private String department;

	// constructor
	public Employee(String firstName, String lastName, double salary, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.department = department;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
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
	}

	// set firstName
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// get firstName
	public String getFirstName() {
		return firstName;
	}

	// set lastName
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// get lastName
	public String getLastName() {
		return lastName;
	}

	// set salary
	public void setSalary(double salary) {
		this.salary = salary;
	}

	// get salary
	public double getSalary() {
		return salary;
	}

	// set department
	public void setDepartment(String department) {
		this.department = department;
	}

	// get department
	public String getDepartment() {
		return department;
	}

	// return Employee's first and last name combined
	public String getName() {
		return String.format("%s %s", getFirstName(), getLastName());
	}

	// return a String containing the Employee's information
	@Override
	public String toString() {
		return String.format("%-8s %-8s %8.2f   %s", getFirstName(), getLastName(), getSalary(), getDepartment());
	} // end method toString
} // end class Employee
