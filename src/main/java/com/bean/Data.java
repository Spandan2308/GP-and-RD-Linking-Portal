package com.bean;

import java.sql.Date;

public class Data {
	private int uid,ufn,mobile,aadhar_no;
	private Date time;
	private String name,fname,birth_certi,death_certi;
	public Date getTime() {
		return time;
	}
	public void setTime(Date date) {
		this.time = date;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getUfn() {
		return ufn;
	}
	public void setUfn(int ufn) {
		this.ufn = ufn;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public int getAadhar_no() {
		return aadhar_no;
	}
	public void setAadhar_no(int aadhar_no) {
		this.aadhar_no = aadhar_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getBirth_certi() {
		return birth_certi;
	}
	public void setBirth_certi(String birth_certi) {
		this.birth_certi = birth_certi;
	}
	public String getDeath_certi() {
		return death_certi;
	}
	public void setDeath_certi(String death_certi) {
		this.death_certi = death_certi;
	}
}
