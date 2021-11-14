package exercise_2_2;

import java.util.ArrayList;

/**
 * A teaching assistant in the university
 * 
 * @author Johannes
 *
 */
public class TA {

	public String name;
	public ArrayList<Course> courses;
	public ArrayList<Exam> exam;
	public int contractLength;
	
	/**
	 * Constructor of TA
	 * 
	 * @param name, name of TA
	 * @param courses, courses of TA
	 */
	public TA(String name, ArrayList<Course> courses, ArrayList<Exam> exam, int contractLength) {
		this.name = name;
		this.courses = courses;
		this.exam = exam;
		this.contractLength = contractLength;
	}
	
	/**
	 * 
	 * @return
	 */
	public ArrayList<Course> getCourse() {
		return courses;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Extends the contract of a teaching assistant in a course. (Assumption: course ID unique)
	 * 
	 * @param course, a course in the university
	 */
	public void extendContract(Course course) {
		for(int i = 0; i < courses.size(); i++) {
			// Check if the teaching assistant is teaching the requested course
			if(course.id == courses.get(i).id) {
				// If yes, his contract gets extended by one semester
				contractLength += 1;
				break;
			}
		}
	}
	
	/**
	 * 
	 * @param name, new name
	 */
	public void setName(String name) {
		this.name = name;
	}
}
