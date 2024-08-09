package One_to_one_Get;

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
@Table(name = "country_502")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coun_Id")
    private int countryId;

    @Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + ", capital=" + capital + "]";
	}

	@Column(name = "count_name")
    private String countryName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "capital_Id")
    private Capital capital;

    // Getters and setters

    public void setCapital(Capital capital) {
        this.capital = capital;
    }
	
	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	

}
