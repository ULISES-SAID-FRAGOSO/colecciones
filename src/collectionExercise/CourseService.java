package collectionExercise;

import java.util.HashMap;

public class CourseService
{
    HashMap<String, Student> students = new HashMap<>();

    HashMap<String, Course> courses = new HashMap<>();


    public CourseService()
    {
        students.put( "120120", new Student( "Santiago", "120120" ) );
        students.put( "884545", new Student( "Kate", "884545" ) );
        students.put( "458787", new Student( "Alejandra", "458787" ) );
        students.put( "135464", new Student( "Maria", "135464" ) );
        students.put( "778979", new Student( "Peter", "778979" ) );

        courses.put( "math_01", new Course( "Mathematics 1", "math_01", 8 ) );
        courses.put( "biol_01", new Course( "Biology 1", "biol_01", 8 ) );
        courses.put( "phys_01", new Course( "Physics 1", "phys_01", 8 ) );
        courses.put( "art_01", new Course( "Arts 1", "art_01", 8 ) );
        courses.put( "chem_01", new Course( "Chemistry 1", "chem_01", 8 ) );
        courses.put( "sport_01", new Course( "Sports 1", "sport_01", 8 ) );
    }

    public void enrollStudent(String studentId, String courseId){
        //TODO implement so it adds the given course form the student
    	Student student = students.get(studentId);
    	Course course = courses.get(courseId);
    	if (student != null && course != null) {
    		student.enroll(course);
    		System.out.println("\n |---Enrolled " + studentId + " in " + courseId + "---|");
    	} else {
    		System.out.println("invalid studentID and courseID");
    	}
    	
    }

    public void unEnrollStudent(String studentId, String courseId){
        //TODO implement so it removes the given course form the student
    	Student student = students.get(studentId);
    	Course course = courses.get(courseId);
    	if (student != null && course != null) {
    		student.unEnroll(course);
    		System.out.println("\n |---Unenrolled " + student.name + " in " + course.id + "---|");
    	} else {
    		System.out.println("This studentId and courseId is not registered");
    	}
    }

    public void displayCourseInformation(String courseId){
        //TODO implement so it shows the course name, id and credits
    	Course course = courses.get(courseId);
    	if (course != null) {
    		System.out.println("course name: \n"  + course.name);
    		System.out.println("course ID: \n" + course.id);
    		System.out.println("Credits: \n" + course.credits);
    	}else {
    		System.out.println("This course is not found");
    	}
    }

    public void displayStudentInformation(String studentId){
        //TODO implement so it shows the student name, id and list of enrolled courses
    	
    	Student student = students.get(studentId);
    	
    	if (student !=null) {
    		System.out.println("\nStudent Name: " + student.name);
    		System.out.println("Student ID: " + student.id);
    		System.out.println("Enrolled courses: " + student.enrolledCourses);
    	}
    }


}