package om_visual_option_Get;

public class Project {

	private int projectId;
	private String projectName;
	private int forevenId;

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

	public int getForevenId() {
		return forevenId;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", forevenId=" + forevenId + "]";
	}

	public void setForevenId(int forevenId) {
		this.forevenId = forevenId;
	}

}
