package innkapsling_1;

public class MainInsidePackage {

	public static void main(String[] args) {

		Student student = new Student();

		student.nickname = "Nytt Kallenavn";

		// student.realname = "Nytt Navn";
		System.out.println(student.getRealName());
		System.out.println(student.getRealName());
		System.out.println(student.getRealName());
	}
}
