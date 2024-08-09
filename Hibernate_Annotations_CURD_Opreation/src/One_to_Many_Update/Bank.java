package One_to_Many_Update;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bank_509")
public class Bank {

	@Id
	@Column(name = "Bank_ID")
	private Integer bankId;

	@Column(name = "Bank_name")
	private String bankName;

	public Integer getBankId() {
		return bankId;
	}

	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

}
