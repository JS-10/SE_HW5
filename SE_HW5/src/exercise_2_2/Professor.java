package exercise_2_2;

import java.util.ArrayList;

/**
 * A professor of the university. This class inherits from the class "Employee".
 * 
 * @author Johannes
 *
 */
public class Professor extends Employee {

	public ArrayList<Course> courses;
	public ArrayList<Exam> exams;
	public boolean hasChair;
	
	/**
	 * Constructor of professor
	 * 
	 * @param name, name of professor
	 * @param eid, e-id of professor
	 * @param department, department of professor
	 */
	public Professor(String name, int eid, Department department, ArrayList<Course> courses, ArrayList<Exam> exams, boolean hasChair) {
		super(name, eid, department);
		this.courses = courses;
		this.exams = exams;
		this.hasChair = hasChair;
	}
	
	/**
	 * Prints out a list of all courses a professor is managing.
	 */
	public void publish_course() {
		if(courses.size() > 0) {
			for(int i = 0; i < courses.size(); i++) {
				System.out.println(courses.get(i));
			}
		}else {
			System.out.println("Professor "+ name +" is not managing any courses.");
		}
	}
	
	/**
	 * Assigns a teaching assistant to one of the professor's courses. If there is a course without any teaching assistants,
	 *  the person gets assigned to the first one on the list. If every course has an assigned teaching assistant, the person
	 *  gets assigned to a random course. (Assumption: all possible teaching assistants fit to the professor's courses)
	 * 
	 * @param ta, teaching assistant to be assigned to one of the professor's courses
	 */
	public void assign_TA(TA ta) {
		// Teaching assistant only assignable if professor manages at least one course
		if(courses.size() > 0) {
			for(int i = 0; i < courses.size(); i++) {
				// If one course has no teaching assistant, the person gets assigned to this course
				if(courses.get(i).teachingAssistants.size() == 0) {
					courses.get(i).apply(ta);
					break;
				// If every course has at least one teaching assistant, the person gets assigned to a random course
				}else if(courses.get(i).teachingAssistants.size() > 0 && i == courses.size() - 1) {
					int random = (int) Math.rint(Math.random() * (courses.size() - 1) );
					courses.get(random).apply(ta);
				}
			}

		}
	}
	
	/**
	 * Adds new courses to professor's list.
	 * 
	 * @param course, new course for professor
	 */
	public void addNewCourse(Course course) {
		courses.add(course);
	}
	
	/**
	 * Prints out a list of all exams a professor is managing.
	 */
	public void publish_exam() {
		for(int i = 0; i < exams.size(); i++) {
			System.out.println(exams.get(i));
		}
	}
	
	/**
	 * Adds new exams to professor's list.
	 * 
	 * @param exam, new exam of professor
	 */
	public void addNewExam(Exam exam) {
		exams.add(exam);
	}
}
