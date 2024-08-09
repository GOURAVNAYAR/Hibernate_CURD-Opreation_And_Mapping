package mo_save;

public class Subject { // parent

	private int subjectId;
	private String subjectName;
	private Student parentObjects;

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Student getParentObjects() {
		return parentObjects;
	}

	public void setParentObjects(Student parentObjects) {
		this.parentObjects = parentObjects;
	}

}
