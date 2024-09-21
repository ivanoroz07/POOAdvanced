package org.school.main;
import org.school.coursesandstudents.Student;
import org.school.coursesandstudents.StudentService;
import org.school.exception.CourseNotFoundException;
import org.school.exception.StudentNotFoundException;

public class Main {
	public static void main(String[] args) {
	    StudentService studentService = new StudentService();
        studentService.addStudents(new Student( "Carlos", "1030", 31 ) );
        studentService.addStudents(new Student( "Ian", "1040", 28 ) );
        studentService.addStudents(new Student( "Elise", "1050", 26 ) );
        studentService.addStudents(new Student( "Santiago", "1020", 33 ) );

        try {
            studentService.enrollStudents("Math", "1030");
        } catch (CourseNotFoundException | StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        try {
			studentService.enrollStudents( "Math01", "1020" );
		} catch (CourseNotFoundException | StudentNotFoundException e) {
			System.out.println(e.getMessage());
		}
        
        try {
			studentService.enrollStudents( "Math", "1040" );
		} catch (CourseNotFoundException | StudentNotFoundException e) {
			System.out.println(e.getMessage());
		}
        
        try {
			studentService.enrollStudents( "Biology", "1050" );
		} catch (CourseNotFoundException | StudentNotFoundException e) {
			System.out.println(e.getMessage());
		}
        studentService.showAllCourses();
        System.out.println(" ");
        studentService.showEnrolledStudents("Math");
    }
}
