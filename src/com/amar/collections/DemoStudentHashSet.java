package com.amar.collections;

public class DemoStudentHashSet {
      private String name ;
      private int rollNumber ;
	public DemoStudentHashSet(String name, int rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
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
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollNumber;
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
		return true;
	}
	
}
