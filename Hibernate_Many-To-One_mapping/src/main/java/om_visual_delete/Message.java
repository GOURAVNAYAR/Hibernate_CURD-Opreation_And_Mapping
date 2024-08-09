package om_visual_delete;

public class Message {
	private int messageId;
	private String messageName;
	private String messageTime;
	private Whatapp parentObjects;

	public Whatapp getParentObjects() {
		return parentObjects;
	}

	public void setParentObjects(Whatapp parentObjects) {
		this.parentObjects = parentObjects;
	}

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public String getMessageName() {
		return messageName;
	}

	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}

	public String getMessageTime() {
		return messageTime;
	}

	public void setMessageTime(String messageTime) {
		this.messageTime = messageTime;
	}

}
