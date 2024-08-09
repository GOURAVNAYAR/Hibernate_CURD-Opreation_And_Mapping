package mm_Delete;

import java.util.Set;

public class Brother {

	private int brotherId;
	private String brotherName;
	private int brotherAge;
	private Set sister;

	public Set getSister() {
		return sister;
	}

	public void setSister(Set sister) {
		this.sister = sister;
	}

	public int getBrotherId() {
		return brotherId;
	}

	public void setBrotherId(int brotherId) {
		this.brotherId = brotherId;
	}

	public String getBrotherName() {
		return brotherName;
	}

	public void setBrotherName(String brotherName) {
		this.brotherName = brotherName;
	}

	public int getBrotherAge() {
		return brotherAge;
	}

	public void setBrotherAge(int brotherAge) {
		this.brotherAge = brotherAge;
	}

}
