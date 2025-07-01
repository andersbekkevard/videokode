package p3_mer_om_java.s2_språkdetaljer;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		return this.name.equals(other.name) && this.age == other.age;
	}

	public static void main(String[] args) {
		Person otto = new Person("Otto", 20);
		Person otto2 = new Person("Otto", 20);

		System.out.println(otto == otto2);
		System.out.println(otto.equals(otto2));
	}
}
