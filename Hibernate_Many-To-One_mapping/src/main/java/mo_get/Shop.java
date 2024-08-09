package mo_get;

public class Shop { // parent

	private int shopId;
	private String shopName;
	private int shopNumber;
	private Markect parentObjects;

	public int getShopId() {
		return shopId;
	}

	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopName=" + shopName + ", shopNumber=" + shopNumber + ", parentObjects="
				+ parentObjects + ", getShopId()=" + getShopId() + ", getShopName()=" + getShopName()
				+ ", getShopNumber()=" + getShopNumber() + ", getParentObjects()=" + getParentObjects()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public int getShopNumber() {
		return shopNumber;
	}

	public void setShopNumber(int shopNumber) {
		this.shopNumber = shopNumber;
	}

	public Markect getParentObjects() {
		return parentObjects;
	}

	public void setParentObjects(Markect parentObjects) {
		this.parentObjects = parentObjects;
	}

}
