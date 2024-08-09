package Many_to_One_Get;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bank")
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bank_id")
    private int bankId;

    @Column(name = "bank_name")
    private String bankName;

    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL)
    private List<Customer> customers;

    public Bank() {
        this.customers = new ArrayList<>(); // Initialize the customers list
    }

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

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

    // Getters and setters
    
}
