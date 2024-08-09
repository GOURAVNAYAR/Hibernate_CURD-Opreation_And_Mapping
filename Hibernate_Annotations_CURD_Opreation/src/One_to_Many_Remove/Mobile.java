package One_to_Many_Remove;

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
@Table(name = "Mobile_508")
public class Mobile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MobileId")
	private int MobileId;

	@Column(name = "MobileName")
	private String MobileName;

	@Column(name = "Mobile_modal")
	private String mobileModal;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = Messege.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "MOBILE_ID")
	private Set<Messege> children;

	public int getMobileId() {
		return MobileId;
	}

	public void setMobileId(int mobileId) {
		MobileId = mobileId;
	}

	public String getMobileName() {
		return MobileName;
	}

	public void setMobileName(String mobileName) {
		MobileName = mobileName;
	}

	public String getMobileModal() {
		return mobileModal;
	}

	public void setMobileModal(String mobileModal) {
		this.mobileModal = mobileModal;
	}

	@Override
	public String toString() {
		return "Mobile [MobileId=" + MobileId + ", MobileName=" + MobileName + ", mobileModal=" + mobileModal + "]";
	}

	public void setChildren(Set<Mobile> s) {
		// TODO Auto-generated method stub
		
	}

}
