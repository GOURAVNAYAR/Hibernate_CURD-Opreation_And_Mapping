package mo_get;

public class Markect { // child

	private int marketId;
	private String marketName;

	public int getMarketId() {
		return marketId;
	}

	@Override
	public String toString() {
		return "Markect [marketId=" + marketId + ", marketName=" + marketName + ", getMarketId()=" + getMarketId()
				+ ", getMarketName()=" + getMarketName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public void setMarketId(int marketId) {
		this.marketId = marketId;
	}

	public String getMarketName() {
		return marketName;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}

}
