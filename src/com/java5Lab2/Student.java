package com.java5Lab2;

public class Student {
private String namesv;
private Double mark;
private String major;
public Student() {
	super();
}
public Student(String namesv, Double mark, String major) {
	super();
	this.namesv = namesv;
	this.mark = mark;
	this.major = major;
}
public String getNamesv() {
	return namesv;
}
public void setNamesv(String namesv) {
	this.namesv = namesv;
}
public Double getMark() {
	return mark;
}
public void setMark(Double mark) {
	this.mark = mark;
}
public String getMajor() {
	return major;
}
public void setMajor(String major) {
	this.major = major;
}

}
