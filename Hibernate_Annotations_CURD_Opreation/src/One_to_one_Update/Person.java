package One_to_one_Update;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import One_to_one_Save.Address;

@Entity
@Table(name = "person_504")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "person_Id")
	private int personId;

	@Column(name = "person_Name")
	private String personName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "password_id")
	private Passport Passport;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Passport getPassport() {
		return Passport;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", Passport=" + Passport + "]";
	}

	public void setPassport(Passport passport) {
		Passport = passport;
	}

	
	
}
