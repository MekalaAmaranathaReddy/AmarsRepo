package com.amar.collections;

public class Course {
     String courseName ;

	public Course(String courseName) {
		super();
		this.courseName = courseName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + "]";
	}
     
}
