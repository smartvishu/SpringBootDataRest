package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Alien {
@Id
@GeneratedValue
private int aid;
private String aname;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
@Override
public String toString() {
	return "Alien [aid=" + aid + ", aname=" + aname + ", tech=" + tech + "]";
}
public String getAname() {
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
private String tech;
}
