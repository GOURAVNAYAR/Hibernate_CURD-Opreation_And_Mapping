package One_to_Many_Get;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Topic_507")
public class Topic {

	@Id
	@Column(name = "topicId")
	private int topicId;

	@Override
	public String toString() {
		return "Topic [topicId=" + topicId + ", topicName=" + topicName + ", IMPtopicName=" + IMPtopicName + "]";
	}

	@Column(name = "topicName")
	private String topicName;

	@Column(name = "IMPtopicName")
	private String IMPtopicName;

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getIMPtopicName() {
		return IMPtopicName;
	}

	public void setIMPtopicName(String iMPtopicName) {
		IMPtopicName = iMPtopicName;
	}

	

}
