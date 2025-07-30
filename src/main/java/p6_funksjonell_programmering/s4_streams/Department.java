package p6_funksjonell_programmering.s4_streams;

import java.util.List;

public class Department {
	private String name;
	private List<Employee> employees;

	public Department(String name, List<Employee> employees) {
		this.name = name;
		this.employees = employees;
	}

	public String getName() {
		return name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	@Override
	public String toString() {
		return name + " (" + employees.size() + " employees)";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Department department = (Department) obj;
		return name.equals(department.name) && employees.equals(department.employees);
	}
}