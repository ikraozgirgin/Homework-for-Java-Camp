

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý(C# + Angular)","Engin Demirog", 5);
		Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý(Java + React)","Engin Demirog",32);
		Course course3 = new Course(3, "Programlamaya Giriþ Ýçin Temel Kurs","Engin Demirog", 0);

		Course[] courses = {course1, course2, course3};
		
		
		
		User user1 =new User(01, "Ikra Ozgirgin", "ozgirginikra@gmail.com");
		User user2 =new User(02, "Ali Veli", "aliveli@gmail.com");        //random name
		User user3 =new User(03, "Selen Demir", "selendemir@gmail.com");  //random name
		
		User[] users = {user1, user2, user3};
		
		System.out.println("KURSLARIMIZ:");
		System.out.println("------------------------------------------------");

		for (Course course : courses) {
			
			System.out.println(course.name);
		}
		

		System.out.println("\n\nKULLANICILAR:");
		System.out.println("------------------------------------------------");
		
		
        for (User user : users) {
			
			System.out.println(user.name);
		}
        
        
        
        System.out.println("\n\nKurs Islemleri: ");
        CourseManager courseManager = new CourseManager();
        	courseManager.addToCourse(course1);
        	courseManager.deleteCourse(course1);
        	courseManager.addToCourse(course2);
        	
        System.out.println("\n\nKullanýcý Islemleri:");
        UserManager userManager = new UserManager();
            userManager.addUser(user1);
            userManager.addUser(user2);
            userManager.deleteUser(user3);

            
        
	}

}
