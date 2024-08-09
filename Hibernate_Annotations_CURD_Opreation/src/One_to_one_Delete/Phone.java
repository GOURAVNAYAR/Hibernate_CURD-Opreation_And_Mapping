package One_to_one_Delete;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "phone_503")
public class Phone {

	@Override
	public String toString() {
		return "Phone [phone_Id=" + phone_Id + ", phone_name=" + phone_name + ", sim=" + sim + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "phone_Id")
	private int phone_Id;

	@Column(name = "phone_name")
	private String phone_name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SIM_Id")
	private SIM sim;

	public int getPhone_Id() {
		return phone_Id;
	}

	public void setPhone_Id(int phone_Id) {
		this.phone_Id = phone_Id;
	}

	public String getPhone_name() {
		return phone_name;
	}

	public void setPhone_name(String phone_name) {
		this.phone_name = phone_name;
	}

	public SIM getSim() {
		return sim;
	}

	public void setSim(SIM sim) {
		this.sim = sim;
	}

}
