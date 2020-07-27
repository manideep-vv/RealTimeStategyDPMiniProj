package com.nt.vo;

public class PatientVO {
	private String pname;
	private String paddr;
	private String page;
	private String pduration;
	public PatientVO(String pname, String paddr, String page, String pduration) {
	this.pname=pname;
	this.paddr=paddr;
	this.page=page;
	this.pduration=pduration;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPaddr() {
		return paddr;
	}
	public void setPaddr(String paddr) {
		this.paddr = paddr;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getPduration() {
		return pduration;
	}
	public void setPduration(String pduration) {
		this.pduration = pduration;
	}

}
