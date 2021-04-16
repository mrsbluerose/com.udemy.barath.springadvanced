package com.udemy.barath.spring.springcoreadvanced.assignment;

public class Reservation {

	private int id;
	private String time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", time=" + time + "]";
	}

}
