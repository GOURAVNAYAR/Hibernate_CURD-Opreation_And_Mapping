package om_Get;

public class Customer {

	private int customerId;
	private String customerName;
	private long customerNumber;
	private String customerAccountType;
	private long customerAccountnumber;
	private int forevenId;

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

	public long getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(long customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCustomerAccountType() {
		return customerAccountType;
	}

	public void setCustomerAccountType(String customerAccountType) {
		this.customerAccountType = customerAccountType;
	}

	public long getCustomerAccountnumber() {
		return customerAccountnumber;
	}

	public void setCustomerAccountnumber(long customerAccountnumber) {
		this.customerAccountnumber = customerAccountnumber;
	}

	public int getForevenId() {
		return forevenId;
	}

	public void setForevenId(int forevenId) {
		this.forevenId = forevenId;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerNumber="
				+ customerNumber + ", customerAccountType=" + customerAccountType + ", customerAccountnumber="
				+ customerAccountnumber + ", forevenId=" + forevenId + "]";
	}

}
