package exercise_2_2;

/**
 * An employee of the university.
 * 
 * @author Johannes
 *
 */
public class Employee {

	public String name;
	public int eid;
	public Department department;
	
	/**
	 * Constructor of Employee
	 * 
	 * @param name, name of employee
	 * @param eid, e-id of employee
	 */
	public Employee(String name, int eid, Department department) {
		this.name = name;
		this.eid = eid;
		this.department = department;
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
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return
	 */
	public int getEid() {
		return eid;
	}

	/**
	 * 
	 * @param eid
	 */
	public void setEid(int eid) {
		this.eid = eid;
	}

	/**
	 * 
	 * @return
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * 
	 * @param department
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

}
