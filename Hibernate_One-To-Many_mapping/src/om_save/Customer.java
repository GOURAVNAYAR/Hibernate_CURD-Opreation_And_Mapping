package om_save;

import java.util.Set;

public class Customer {

	public int customerId;
	public String customerName;
	public Integer forevenId;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getForevenId() {
		return forevenId;
	}

	public void setForevenId(Integer forevenId) {
		this.forevenId = forevenId;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", forevenId=" + forevenId
				+ "]";
	}

	public void setChildren(Set s) {
		// TODO Auto-generated method stub
		
	}
	
	

}
