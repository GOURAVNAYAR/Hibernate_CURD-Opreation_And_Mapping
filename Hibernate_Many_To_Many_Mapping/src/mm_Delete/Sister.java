package mm_Delete;

import java.util.Set;

public class Sister {

	private int sisterId;
	private String sisterName;
	private Set<Brother> brother;

	public Set<Brother> getBrother() {
		return brother;
	}

	public void setBrother(Set<Brother> brother) {
		this.brother = brother;
	}

	public int getSisterId() {
		return sisterId;
	}

	public void setSisterId(int sisterId) {
		this.sisterId = sisterId;
	}

	public String getSisterName() {
		return sisterName;
	}

	public void setSisterName(String sisterName) {
		this.sisterName = sisterName;
	}

}
