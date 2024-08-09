package OO_visual_save;

public class Mobile {

	private int mobileId;
	private String brand;
	private User user; // One-to-One mapping with User

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", brand=" + brand + ", user=" + user + "]";
	}

}
