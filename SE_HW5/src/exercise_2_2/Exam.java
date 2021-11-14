package exercise_2_2;

import java.util.ArrayList;

/**
 * An exam written/to be written in the university.
 * 
 * @author Johannes
 *
 */
public class Exam {

	/**
	 * A question of an exam. (Composition)
	 * 
	 * @author Johannes
	 *
	 */
	class Question {

		public String task;
		public int maxValue;
		public int q_id;
		
		/**
		 * Constructor of question
		 * 
		 * @param id, question id
		 * @param task, task
		 * @param value, value of question
		 */
		public Question(int id, String task, int value) {
			this.q_id = id;
			this.task = task;
			this.maxValue = value;
		}

		/**
		 * 
		 * @return
		 */
		public String getTask() {
			return task;
		}

		/**
		 * 
		 * @param task
		 */
		public void setTask(String task) {
			this.task = task;
		}

		/**
		 * 
		 * @return
		 */
		public int getMaxValue() {
			return maxValue;
		}

		/**
		 * 
		 * @param maxValue
		 */
		public void setMaxValue(int maxValue) {
			this.maxValue = maxValue;
		}

		/**
		 * 
		 * @return
		 */
		public int getQ_id() {
			return q_id;
		}
		
		/**
		 * 
		 * @param q_id
		 */
		public void setQ_id(int q_id) {
			this.q_id = q_id;
		}
		
		
	}
	
	public int max_value;
	public Course course;
	public ArrayList<Question> questions;
	public ArrayList<Student> students;
	
	/**
	 * Constructor of Exam
	 * 
	 * @param max_value, maximum value of exam
	 * @param course, course of exam
	 * @param questions, questions of exam
	 * @param student, students to write the exam
	 */
	public Exam(int max_value, Course course, ArrayList<Question> questions, ArrayList<Student> students) {
		this.max_value = max_value;
		this.course = course;
		this.questions = questions;
		this.students = students;
	}
	
	/**
	 * Checks if student can register for the exam. (Assumption: course and student ID unique)
	 * 
	 * @param student, student who wants to register for exam
	 * @return
	 */
	public boolean register(Student student) {
		// Parameter to check possibility
		boolean possible = true;
		for(int i = 0; i < student.courses.size(); i++) {
			// If yes, check if one of the courses is the one which has the exam
			if(student.courses.get(i).id == course.id) {
				// If yes, check if there is at least one student registered for the exam
				if(students.size() > 0) {
					for(int j = 0; j < students.size(); j++) {
						// If student is already registered for the exam, it is not possible to register again
						if(student.getStudent_id() == students.get(j).student_id) {
							possible = false;
							break;
						}
						// Else, it is possible for the student to register for the exam
					}
				}
				// If there are no students registered for the exam, the student can register for the exam without the check
				break;
			// If the student does not take the course which has the exam, it is not possible to register for the exam
			}else if(student.courses.get(i).id != course.id && i == student.courses.size() - 1) {
				possible = false;
				break;
			}
		}
		// returns the result whether registration is possible or not
		return possible;
	}
	
	/**
	 * Adds a question to the question list.
	 * 
	 * @param id, id of question
	 * @param task, task
	 * @param value, value of question
	 */
	public void addQuestion(int id, String task, int value) {
		Question q = new Question(id, task, value);
		questions.add(q);
	}
	
	/**
	 * 
	 * @return
	 */
	public ArrayList<Student> getRegisteredStudents() {
		return students;
	}
	
	/**
	 * 
	 * @param max, maximum value
	 */
	public void setMaxValue(int max) {
		this.max_value = max;
	}
}
