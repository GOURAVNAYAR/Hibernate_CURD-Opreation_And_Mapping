package mo_update;


public class Student {

	private int studentId;
	private String studentName;
	private int studentAge;
	private College parentObjects;

	public College getParentObjects() {
		return parentObjects;
	}

	public void setParentObjects(College parentObjects) {
		this.parentObjects = parentObjects;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
}
