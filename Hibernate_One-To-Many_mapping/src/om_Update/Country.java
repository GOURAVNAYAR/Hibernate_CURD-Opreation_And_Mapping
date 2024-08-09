package om_Update;

import java.util.Set;

public class Country {
	private int countryId;
	private String countryName;
	private Set<State> children;

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Set<State> getChildren() {
		return children;
	}

	public void setChildren(Set<State> children) {
		this.children = children;
	}

}
