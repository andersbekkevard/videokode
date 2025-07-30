package p6_funksjonell_programmering.s4_streams;

public class Student extends Person {
	private double grade;
	private String course;

	public Student(String name, int age, double grade, String course) {
		super(name, age);
		this.grade = grade;
		this.course = course;
	}

	public double getGrade() {
		return grade;
	}

	public String getCourse() {
		return course;
	}

	@Override
	public String toString() {
		return super.toString() + " - " + course + ": " + grade;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		if (!super.equals(obj))
			return false;
		Student student = (Student) obj;
		return Double.compare(student.grade, grade) == 0 && course.equals(student.course);
	}
}
