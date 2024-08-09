package Many_to_Many_Get;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder.In;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "courses_55")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToMany(targetEntity = Student.class, fetch = FetchType.LAZY)
    private Set<Student> students = new HashSet<>();

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

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}



    // Constructors, getters, and setters
    
}
