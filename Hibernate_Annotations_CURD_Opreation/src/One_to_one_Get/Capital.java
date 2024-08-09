package One_to_one_Get;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "capital_502")
public class Capital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cap_id")
    private int capital_Id;

    @Column(name = "Cap_name")
    private String capitalName;

	public int getCapital_Id() {
		return capital_Id;
	}

	public void setCapital_Id(int capital_Id) {
		this.capital_Id = capital_Id;
	}

	public String getCapitalName() {
		return capitalName;
	}

	public void setCapitalName(String capitalName) {
		this.capitalName = capitalName;
	}

	@Override
	public String toString() {
		return "Capital [capital_Id=" + capital_Id + ", capitalName=" + capitalName + "]";
	}


	

}
