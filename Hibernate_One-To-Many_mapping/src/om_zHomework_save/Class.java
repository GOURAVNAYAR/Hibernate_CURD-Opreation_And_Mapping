package om_zHomework_save;

import java.util.Set;

public class Class {

	private int classId;
	private String className;
	private int totalstudentofthaClass;
	private Set children;

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getTotalstudentofthaClass() {
		return totalstudentofthaClass;
	}

	public void setTotalstudentofthaClass(int totalstudentofthaClass) {
		this.totalstudentofthaClass = totalstudentofthaClass;
	}

	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

}
