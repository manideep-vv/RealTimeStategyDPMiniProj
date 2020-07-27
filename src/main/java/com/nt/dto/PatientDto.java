package com.nt.dto;

public class PatientDto {
	private String pname;
	private String addrs;
	private Float days;
	private int age;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public Float getDays() {
		return days;
	}
	public void setDays(Float days) {
		this.days = days;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public PatientDto(String pname, String addrs, Float days, int age) {
		super();
		this.pname = pname;
		this.addrs = addrs;
		this.days = days;
		this.age = age;
	}
public PatientDto() {
	// TODO Auto-generated constructor stub
}
}
