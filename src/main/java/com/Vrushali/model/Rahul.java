package com.Vrushali.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rahul
{
	@Id
	private int rollNo;
	private String studentName;
	private String deparment;
	private long mobile;
	private String clgName;
	private String universityName;
	private float marks;
	private float percentage;
	private char division;
	private boolean result;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDeparment() {
		return deparment;
	}
	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public char getDivision() {
		return division;
	}
	public void setDivision(char division) {
		this.division = division;
	}
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Rahul [rollNo=" + rollNo + ", studentName=" + studentName + ", deparment=" + deparment + ", mobile="
				+ mobile + ", clgName=" + clgName + ", universityName=" + universityName + ", marks=" + marks
				+ ", percentage=" + percentage + ", division=" + division + ", result=" + result + "]";
	}
	
	
}
