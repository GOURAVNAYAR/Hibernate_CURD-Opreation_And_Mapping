package OO_CRUD_Opration;

public class Address {

	private Integer  id;
	private String street;
	private String city;
	private String zipCode;

	public Integer  getId() {
		return id;
	}

	public void setId(Integer  id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", zipCode=" + zipCode + "]";
	}

}
