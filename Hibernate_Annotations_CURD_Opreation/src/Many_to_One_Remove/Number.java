package Many_to_One_Remove;

import javax.persistence.*;

@Entity
@Table(name = "number")
public class Number {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "number_id")
	private int id;

	@Column(name = "number_value")
	private String value;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	// Getters and setters

}
