package OO_visual_save;

public class User {

	private int userId;
	private String username;
	private Mobile mobile;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", mobile=" + mobile + "]";
	}

}
