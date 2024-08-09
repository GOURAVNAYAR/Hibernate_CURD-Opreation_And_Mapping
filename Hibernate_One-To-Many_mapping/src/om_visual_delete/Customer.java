package om_visual_delete;

import java.util.Set;

public class Customer {

	private int customerId;
	private int customerName;
	private Set children;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getCustomerName() {
		return customerName;
	}

	public void setCustomerName(int customerName) {
		this.customerName = customerName;
	}

	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", children=" + children + "]";
	}

}
