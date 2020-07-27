package com.nt.bo;

public class PatientBO {
private String pname;
private String addrs;
private Float days;
private int age;
private Float amnt;


public PatientBO(String pname, String addrs, Float days, int age, Float amnt) {
	super();
	this.pname = pname;
	this.addrs = addrs;
	this.days = days;
	this.age = age;
	this.amnt = amnt;
}
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
public Float getAmnt() {
	return amnt;
}
public void setAmnt(Float amnt) {
	this.amnt = amnt;
}
@Override
public String toString() {
	return "PatientBO [pname=" + pname + ", addrs=" + addrs + ", days=" + days + ", age=" + age + ", amnt=" + amnt
			+ "]";
}



	
}
