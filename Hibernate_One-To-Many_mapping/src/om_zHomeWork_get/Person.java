package om_zHomeWork_get;

import java.util.Set;

public class Person {

	private int personId;
	private String personName;
	private Set children;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", children=" + children + "]";
	}

}
