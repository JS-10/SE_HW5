package exercise_2_2;

import java.util.ArrayList;

/**
 * A student from the university.
 * 
 * @author Johannes
 *
 */
public class Student {

	public String name;
	public int student_id;
	public Project project;
	public ArrayList<Course> courses;
	public ArrayList<Exam> exam;
	
	/**
	 * Constructor of Student
	 * 
	 * @param name, name of student
	 * @param student_id, id of student
	 * @param project, project of student
	 * @param courses, courses of student
	 * @param exam, exams written by student
	 */
	public Student(String name, int student_id, Project project, ArrayList<Course> courses, ArrayList<Exam> exam) {
		this.name = name;
		this.student_id = student_id;
		this.project = project;
		this.courses = courses;
		this.exam = exam;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @return
	 */
	public Project getProjects() {
		return project;
	}

	/**
	 * 
	 * @return
	 */
	public int getStudent_id() {
		return student_id;
	}
	
	
}
