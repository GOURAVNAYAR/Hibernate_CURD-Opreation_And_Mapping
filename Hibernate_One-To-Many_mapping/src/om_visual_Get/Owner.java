package om_visual_Get;

import java.util.Set;

public class Owner {

	private int ownerId;
	private String ownerName;
	private Set children;

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "Owner [ownerId=" + ownerId + ", ownerName=" + ownerName + ", children=" + children + "]";
	}
	
	

}
