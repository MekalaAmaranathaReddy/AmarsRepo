package com.amar.treeMapDemo;

public class DemoStudentHashSet {
      private String name ;
      private int rollNumber ;
      private int totalMarks ;
      private String grade ;
	public DemoStudentHashSet(String name, int rollNumber ,int totalMarks) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.totalMarks = totalMarks ;
	}
	/**
	 * @return the totalMarks
	 */
	public final int getTotalMarks() {
		return totalMarks;
	}
	/**
	 * @param totalMarks the totalMarks to set
	 */
	public final void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	/**
	 * @return the grade
	 */
	public final String getGrade() {
		
		if(totalMarks >=60)
		{
			grade = "A";
		}
		else if((totalMarks < 60 && totalMarks >= 40))
		{
			grade = "B";
		}
		else if(totalMarks < 40)
		{
			grade = "C";
		}
		
		return grade;
	}
	
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final int getRollNumber() {
		return rollNumber;
	}
	public final void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	@Override
	public String toString() {
		return "DemoStudentHashSet [name=" + name + ", rollNumber="
				+ rollNumber + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((grade == null) ? 0 : grade.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollNumber;
		result = prime * result + totalMarks;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof DemoStudentHashSet)) {
			return false;
		}
		DemoStudentHashSet other = (DemoStudentHashSet) obj;
		if (grade == null) {
			if (other.grade != null) {
				return false;
			}
		} else if (!grade.equals(other.grade)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (rollNumber != other.rollNumber) {
			return false;
		}
		if (totalMarks != other.totalMarks) {
			return false;
		}
		return true;
	}
	
}
