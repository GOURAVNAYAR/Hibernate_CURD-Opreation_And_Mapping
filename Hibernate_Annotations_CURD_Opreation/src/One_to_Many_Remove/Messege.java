package One_to_Many_Remove;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Messege_508")
public class Messege {

    @Id
    @Column(name = "MessegeId")
    private int messegeId;

    @Column(name = "MessegeName")
    private String messegeName;

    @Column(name = "MessegeTime")
    private String messegeTime;


    public int getMessegeId() {
        return messegeId;
    }

    public void setMessegeId(int messegeId) {
        this.messegeId = messegeId;
    }

    public String getMessegeName() {
        return messegeName;
    }

    public void setMessegeName(String messegeName) {
        this.messegeName = messegeName;
    }

    public String getMessegeTime() {
        return messegeTime;
    }

    public void setMessegeTime(String messegeTime) {
        this.messegeTime = messegeTime;
    }

	public void setChildren(Set<Mobile> s) {
		// TODO Auto-generated method stub
		
	}

   
}
