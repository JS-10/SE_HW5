package exercise_2_2;

import java.util.ArrayList;

/**
 * A department of the university.
 * 
 * @author Johannes
 *
 */
public class Department {

	public String name;
	public ArrayList<Employee> employee;
	public Professor chair;
	public ArrayList<Course> courses;
	
	/**
	 * Constructor of Department
	 * 
	 * @param name, name of department
	 * @param employee, list of employees
	 * @param chair, professor of department
	 * @param courses, list of courses of department
	 */
	public Department(String name, ArrayList<Employee> employee, Professor chair, ArrayList<Course> courses) {
		this.name = name;
		this.employee = employee;
		this.chair = chair;
		this.courses = courses;
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
	 * @param name, name of department
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return
	 */
	public ArrayList<Employee> getEmployee() {
		return employee;
	}

	/**
	 * 
	 * @param employee, list of employees of department
	 */
	public void setEmployee(ArrayList<Employee> employee) {
		this.employee = employee;
	}

	/**
	 * 
	 * @return
	 */
	public Professor getChair() {
		return chair;
	}

	/**
	 * 
	 * @param chair, professor of department
	 */
	public void setChair(Professor chair) {
		this.chair = chair;
	}

	/**
	 * 
	 * @return
	 */
	public ArrayList<Course> getCourses() {
		return courses;
	}

	/**
	 * 
	 * @param courses, list of courses of department
	 */
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
	
}
