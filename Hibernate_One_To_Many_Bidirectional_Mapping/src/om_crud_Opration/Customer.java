package om_crud_Opration;

import java.util.Iterator;

public class Customer {

	private int customerId;
	private String customerName;
	private int forevenId;
	private Vendor parentObjets; 

	// Getter and setter methods for the parent object property

	public Vendor getParentObjets() { 
		return parentObjets;
	}

	public void setParentObjets(Vendor parentObjets) { 
		this.parentObjets = parentObjets;
	}

	public int getForevenId() {
		return forevenId;
	}

	public void setForevenId(int forevenId) {
		this.forevenId = forevenId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", forevenId=" + forevenId
				+ ", parentObjets=" + parentObjets + ", getParentObjets()=" + getParentObjets() + ", getForevenId()="
				+ getForevenId() + ", getCustomerId()=" + getCustomerId() + ", getCustomerName()=" + getCustomerName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public Iterator<Customer> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
