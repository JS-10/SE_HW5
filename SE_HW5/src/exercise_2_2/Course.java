package exercise_2_2;

import java.util.ArrayList;

/**
 * A course in the university.
 * 
 * @author Johannes
 *
 */
public class Course {

	public int id;
	public String name;
	public int maxCapacity;
	public boolean isFull;
	public Professor prof;
	public ArrayList<Student> students;
	public ArrayList<Exam> exam;
	public ArrayList<TA> teachingAssistants;
	
	/**
	 * Constructor of Course
	 * 
	 * @param id; id of the course
	 * @param name; name of the course
	 * @param cap, capacity of students in the course
	 * @param prof, professor teaching in the course
	 */
	public Course(int id, String name, int cap, Professor prof) {
		this.id = id;
		this.name = name;
		this.maxCapacity = cap;
		this.prof = prof;
	}
	
	/**
	 * Enrolls a student to the course.
	 * 
	 * @param student, student in the course
	 */
	public void enroll(Student student) {
		students.add(student);
	}
	
	/**
	 * Applies a teaching assistant to the course.
	 * 
	 * @param ta, teaching assistant
	 */
	public void apply(TA ta) {
		teachingAssistants.add(ta);
	}
	
	/**
	 * 
	 * @param max, maximum capacity
	 */
	public void setMaxCap(int max) {
		this.maxCapacity = max;
	}
	
	/**
	 * 
	 * @return
	 */
	public Professor getProf() {
		return prof;
	}
	
	/**
	 * 
	 * @return
	 */
	public ArrayList<TA> getTA() {
		return teachingAssistants;
	}
	
	/**
	 * 
	 * @param ta, new teaching assistant
	 */
	public void setNewTA(ArrayList<TA> ta) {
		this.teachingAssistants = ta;
	}
	
	/**
	 * 
	 * @param s, new course name
	 */
	public void setName(String s) {
		this.name = s;
	}
	
}
