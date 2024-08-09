package Many_to_Many_Get;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "students_55")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private int id;

	@Column(name = "name")
	private long name;

	@ManyToMany(targetEntity = Course.class, cascade = CascadeType.ALL)
	@JoinTable(name = "student_course", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
	private Set<Course> courses = new HashSet<>();

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int i) {
		this.id = i;
	}

	public long getName() {
		return name;
	}

	public void setName(long l) {
		this.name = l;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	// Constructors, getters, and setters

}
