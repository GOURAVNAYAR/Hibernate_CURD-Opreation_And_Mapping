package One_to_Many_Get;

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

import One_to_Many_Save.Student;

@Entity
@Table(name = "Book_507")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BookId")
    private int bookId;

    @Column(name = "BookName")
    private String bookName;

    @Column(name = "BookwriterName")
    private String bookWritername;

    @OneToMany(fetch = FetchType.LAZY, targetEntity = Topic.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "BOOOK_ID") // Corrected column name
    private Set<Topic> children;


	public int getBookId() {
		return bookId;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookWritername=" + bookWritername
				+ ", children=" + children + "]";
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookWritername() {
		return bookWritername;
	}

	public void setBookWritername(String bookWritername) {
		this.bookWritername = bookWritername;
	}

	public Set<Topic> getChildren() {
		return children;
	}

	public void setChildren(Set<Topic> children) {
		this.children = children;
	}

}
