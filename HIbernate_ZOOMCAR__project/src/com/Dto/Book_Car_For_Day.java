package com.Dto;

import javax.persistence.*;

@Entity
@Table(name = "Book_Car_For_Day")
public class Book_Car_For_Day {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookcarfordayId")
    private int bookcarfordayId;

    @Column(name = "Date")
    private String date;

    @Column(name = "Time")
    private String time;

    @Column(name = "Location")
    private String location;

    @ManyToOne
    @JoinColumn(name = "car_details_id", nullable = false)
    private Car_Details carDetails;

	public int getBookcarfordayId() {
		return bookcarfordayId;
	}

	public void setBookcarfordayId(int bookcarfordayId) {
		this.bookcarfordayId = bookcarfordayId;
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

	public Car_Detals getCarDetails() {
		return carDetails;
	}

	public void setCarDetails(Car_Detals carDetails) {
		this.carDetails = carDetails;
	}
}