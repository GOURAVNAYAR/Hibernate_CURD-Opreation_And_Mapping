package One_to_Many_Save;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Subject") // Vendor.java.java

public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "subj_id")
	private int subjectId;

	@Column(name = "subj_Name")
	private String subjectName;

	@OneToMany(fetch = FetchType.LAZY, targetEntity = Student.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "STUDENTID", referencedColumnName = "subj_id")

	private Set<Student> children;


	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int i) {
		this.subjectId = i;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Set<Student> getChildren() {
		return children;
	}

	public void setChildren(Set<Student> children) {
		this.children = children;
	}

}
