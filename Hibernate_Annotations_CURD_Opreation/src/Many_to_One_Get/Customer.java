package Many_to_One_Get;

import javax.persistence.*;

@Entity
@Table(name = "customer_45")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private int customerId;

	@Column(name = "customer_name")
	private String customerName;

	@ManyToOne
	@JoinColumn(name = "bank_id")
	private Bank bank;

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

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	// Getters and setters

}
