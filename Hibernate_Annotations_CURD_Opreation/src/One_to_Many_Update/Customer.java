package One_to_Many_Update;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Customer_509") // Vendor.java.java
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Customer_id")
	private int customerId;

	@Column(name = "customer_Name")
	private String customerName;

	@OneToMany(fetch = FetchType.LAZY, targetEntity = Bank.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "BANK_ID", referencedColumnName = "Customer_id")

	private Set<Bank> children;

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

	public Set<Bank> getChildren() {
		return children;
	}

	public void setChildren(Set<Bank> children) {
		this.children = children;
	}

}
