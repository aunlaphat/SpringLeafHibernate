package com.example.thymeleafdemo;



//@Entity
//@Table(name="booking")
public class UserBook {
	
	/*@Id
	@GeneratedValue
	@Column(name="id")
	private int id;*/
	
	//@Column(name="name")
	private String name;
	
	//@Column(name="num")
	private String num;
	
	//@Column(name="date")
	private String date;
	
	//@Column(name="time")
	private String time;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
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
	
	@Override
	public String toString() {
		return "UserBook [name=" + name + ", num=" + num + ", date=" + date + ", time=" + time + "]";
	}

	
}
