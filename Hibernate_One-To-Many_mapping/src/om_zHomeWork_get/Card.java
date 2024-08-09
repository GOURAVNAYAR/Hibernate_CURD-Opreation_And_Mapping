package om_zHomeWork_get;

public class Card {
	private int cardId;
	private String cardName;
	private String cardType;
	private int forevenId;

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public int getForevenId() {
		return forevenId;
	}

	public void setForevenId(int forevenId) {
		this.forevenId = forevenId;
	}

	@Override
	public String toString() {
		return "Card [cardId=" + cardId + ", cardName=" + cardName + ", cardType=" + cardType + ", forevenId="
				+ forevenId + "]";
	}

	
}
