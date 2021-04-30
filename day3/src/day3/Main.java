package day3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Course course1 = new Course();
	course1.setId(1);
	course1.setCoursaName("Java + React");
	
	Course course2 = new Course();
	course2.setId(2);
	course2.setCoursaName("C# + Angular");
	
	Course[] courses = {course1, course2};
	
	User user1 = new User();
	user1.setId(1);
	user1.setFirstName("Yasin");
	user1.setLastName("Erpay");
	user1.setAge(21);
	
	User user2 = new User();
	user2.setAge(2);
	user2.setFirstName("Engin");
	user2.setLastName("Demiroğ");
	user2.setAge(35);
	
	Student student = new Student();
	student.setId(1);
	student.setFirstName("Yasin");
	student.setLastName("Erpay");
	student.setAge(21);
	student.setSchoolName("Kastamonu Üniversitesi");
	student.setSchoolNumber(123456);
	
	Instructor instructor = new Instructor();
	instructor.setId(1);
	instructor.setFirstName("Engin");
	instructor.setLastName("Demiroğ");
	instructor.setAge(35);
	instructor.setInstructorNumber(784512);
	
	UserManager userManager = new UserManager();
	userManager.add(user1);
	userManager.add(user2);
	
	StudentManagar studentManagar = new StudentManagar();
	studentManagar.add(student);
	
	}

}
