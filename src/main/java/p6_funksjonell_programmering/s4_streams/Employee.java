package p6_funksjonell_programmering.s4_streams;

public class Employee extends Person {
	private String department;
	private double salary;

	public Employee(String name, String department, double salary) {
		super(name, 0); // Employee doesn't need age for these exercises
		this.department = department;
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return getName() + " (" + department + ") - $" + salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		if (!super.equals(obj))
			return false;
		Employee employee = (Employee) obj;
		return Double.compare(employee.salary, salary) == 0 && department.equals(employee.department);
	}
}