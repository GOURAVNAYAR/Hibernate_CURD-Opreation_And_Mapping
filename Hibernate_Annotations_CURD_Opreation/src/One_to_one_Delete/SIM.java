package One_to_one_Delete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SIM_503")
public class SIM {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sim_id")
	private int sim_id;

	@Column(name = "sim_name")
	private String sim_Name;

	public int getSim_id() {
		return sim_id;
	}

	public void setSim_id(int sim_id) {
		this.sim_id = sim_id;
	}

	public String getSim_Name() {
		return sim_Name;
	}

	public void setSim_Name(String sim_Name) {
		this.sim_Name = sim_Name;
	}

	@Override
	public String toString() {
		return "SIM [sim_id=" + sim_id + ", sim_Name=" + sim_Name + "]";
	}

}
