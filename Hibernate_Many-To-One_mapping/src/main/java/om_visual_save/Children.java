package om_visual_save;

public class Children { // many

	private int childrenId;
	private String childrenName;
	private int childrenAge;
	private Mother parentObjects;

	public Mother getParentObjects() {
		return parentObjects;
	}

	public void setParentObjects(Mother parentObjects) {
		this.parentObjects = parentObjects;
	}

	public int getChildrenId() {
		return childrenId;
	}

	public void setChildrenId(int childrenId) {
		this.childrenId = childrenId;
	}

	public String getChildrenName() {
		return childrenName;
	}

	public void setChildrenName(String childrenName) {
		this.childrenName = childrenName;
	}

	public int getChildrenAge() {
		return childrenAge;
	}

	public void setChildrenAge(int childrenAge) {
		this.childrenAge = childrenAge;
	}

}
