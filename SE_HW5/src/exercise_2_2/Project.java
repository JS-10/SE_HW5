package exercise_2_2;

import java.util.ArrayList;

/**
 * A project of a course in the university.
 * 
 * @author Johannes
 *
 */
public class Project {

	public String name;
	public ArrayList<Student> members;
	public Course course;
	
	/**
	 * Constructor of Project
	 * 
	 * @param name, name of project
	 * @param members, list of members of project
	 * @param course, course of project
	 */
	public Project(String name, ArrayList<Student> members, Course course) {
		this.name = name;
		this.members = members;
		this.course = course;
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
	 * @param n, new name
	 */
	public void setName(String n) {
		this.name = n;
	}
	
	/**
	 * Adds new member to the project.
	 * 
	 * @param s, new member
	 */
	public void addNewMember(Student s) {
		members.add(s);
	}
	
	/**
	 * 
	 * @return
	 */
	public ArrayList<Student> getMembers() {
		return members;
	}
}
