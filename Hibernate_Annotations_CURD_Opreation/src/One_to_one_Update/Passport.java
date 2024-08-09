package One_to_one_Update;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Passport_504")
public class Passport {

	@Override
	public String toString() {
		return "Passport [Passport_id=" + Passport_id + ", PassportName=" + PassportName + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Passport_Id")
	private Integer Passport_id;

	@Column(name = "Passport_City")
	private String PassportName;

	public Integer getPassport_id() {
		return Passport_id;
	}

	public void setPassport_id(Integer passport_id) {
		Passport_id = passport_id;
	}

	public String getPassportName() {
		return PassportName;
	}

	public void setPassportName(String passportName) {
		PassportName = passportName;
	}

}
