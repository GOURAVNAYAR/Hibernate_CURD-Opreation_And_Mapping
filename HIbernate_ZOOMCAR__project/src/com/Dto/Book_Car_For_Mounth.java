package com.Dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Book_Car_For_Mounth")
public class Book_Car_For_Mounth {

	@Id
	
	@Column(name = "bookcarformounthId")
	private int bookcarformounthId;

	@Column(name = "Date")
	private String date;

	@Column(name = "Time")
	private String time;

	@Column(name = "Location")
	private String location;

	@ManyToOne
	@JoinColumn(name = "myaccountId", nullable = false)
	private My_Account MyAccount;

	public int getBookcarformounthId() {
		return bookcarformounthId;
	}

	public void setBookcarformounthId(int bookcarformounthId) {
		this.bookcarformounthId = bookcarformounthId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public My_Account getMyAccount() {
		return MyAccount;
	}

	public void setMyAccount(My_Account myAccount) {
		this.MyAccount = myAccount;
	}

}
