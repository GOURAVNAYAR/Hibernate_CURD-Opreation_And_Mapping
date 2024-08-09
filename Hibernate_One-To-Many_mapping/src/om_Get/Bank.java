package om_Get;

import java.util.Set;

import om_zHomework_update.Children;

public class Bank {
	private int bankId;
	private String bankName;
	private Set<Children> children;

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

}
