package Many_to_One_Remove;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "person_id")
	private int id;

	@Column(name = "person_name")
	private String name;

	@ManyToOne
	@JoinColumn(name = "number_id")
	private Number number;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Number getNumber() {
		return number;
	}

	public void setNumber(Number number) {
		this.number = number;
	}

	// Getters and setters

}
