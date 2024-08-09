package mo_delete;

public class Project {

	private int projectId;
	private String projectName;
	private Student parentObjects;

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Student getParentObjects() {
		return parentObjects;
	}

	public void setParentObjects(Student parentObjects) {
		this.parentObjects = parentObjects;
	}


}
