package com.Dto;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Popular_place")
public class Popular_place {
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    @Column(name="id",nullable=false,unique=true)
    private int popular_placeId;

    // Correct mappedBy attribute to reference the property in Best_place_To_Vist_in_Bhopal class
    @OneToMany(mappedBy = "popularplace", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Best_place_To_Vist_in_Bhopal> bestplacetovistinbhopal;

    // Getters and Setters
    public int getPopular_placeId() {
        return popular_placeId;
    }

    public void setPopular_placeId(int popular_placeId) {
        this.popular_placeId = popular_placeId;
    }

    public Set<Best_place_To_Vist_in_Bhopal> getBestplacetovistinbhopal() {
        return bestplacetovistinbhopal;
    }

    public void setBestplacetovistinbhopal(Set<Best_place_To_Vist_in_Bhopal> bestplacetovistinbhopal) {
        this.bestplacetovistinbhopal = bestplacetovistinbhopal;
    }

	public void setMyAccount(My_Account my_Account) {
		// TODO Auto-generated method stub
		
	}
}
