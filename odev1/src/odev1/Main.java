package odev1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Course course1 = new Course(1, "C# + Angulara" , "Engin Demiro�", "Yaz�l�m Geli�tirici Yeti�tirme Kamp�");
	Course course2 = new Course(2, "Java + React" , "Engin Demiro�", "Yaz�l�m Geli�tirici Yeti�tirme Kamp�");
	
	
	
	
	
	Course[] courses = {course1, course2};
	
	System.out.println(courses.length);
	
	
	for (Course course : courses) 
	{
		System.out.println(course.courseName);
	}
	
	
	Category category1 = new Category();
	category1.Id = 1;
	category1.name = "Kurslar�m";
	
	Category category2 = new Category();
	category2.Id = 2;
	category2.name = "T�m Kurslar";
	
	Category category3 = new Category();
	category3.Id = 3;
	category3.name = "Kampaa Haz�rl�k";
	
	Category category4 = new Category();
	category4.Id = 1;
	category4.name = "S�k Sorulan Sorular";
	
	
	
	CourseManager courseManager1 = new CourseManager();
	courseManager1.addToCourse(course1);
	courseManager1.addToCourse(course2);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
