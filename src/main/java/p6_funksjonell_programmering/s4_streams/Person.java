package p6_funksjonell_programmering.s4_streams;

import java.util.Objects;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}

		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}

		Person other = (Person) obj;
		return this.name.equals(other.name) && this.age == other.age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

}
