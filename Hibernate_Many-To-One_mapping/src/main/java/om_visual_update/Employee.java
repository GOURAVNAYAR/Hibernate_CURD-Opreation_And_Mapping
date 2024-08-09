package om_visual_update;

public class Employee {
	private int employeeId;
	private String employeeName;
	private Boss parentObjects;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Boss getParentObjects() {
		return parentObjects;
	}

	public void setParentObjects(Boss parentObjects) {
		this.parentObjects = parentObjects;
	}

}
