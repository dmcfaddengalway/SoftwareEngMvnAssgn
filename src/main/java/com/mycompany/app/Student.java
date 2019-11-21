package com.mycompany.app;
import java.util.ArrayList;

import org.joda.time.*;

public class Student {
	
	//Instance Variables
	String name;
	int age;
	DateTime dob;
	int studentID;
	String userName;
	ArrayList<String> coursesRegistered = new ArrayList<>();
	ArrayList<String> programmesRegistered = new ArrayList<>();

	// Constructor
	public Student(String name, int age, DateTime dob, int studentID,
			ArrayList<String> coursesRegistered,
			ArrayList<String> programmesRegistered) {
		super();
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.studentID = studentID;
		this.coursesRegistered = coursesRegistered;
		this.programmesRegistered = programmesRegistered;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public DateTime getDob() {
		return dob;
	}

	public void setDob(DateTime dob) {
		this.dob = dob;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public String getUsername(String name, int age) {
		return name + Integer.toString(age);
	}
	
	public String setUserName(String newUsername) {
		return newUsername;
	}

	public ArrayList<String> getCoursesRegistered() {
		return coursesRegistered;
	}

	public void setCoursesRegistered(ArrayList<String> coursesRegistered) {
		this.coursesRegistered = coursesRegistered;
	}

	public ArrayList<String> getProgrammesRegistered() {
		return programmesRegistered;
	}

	public void setProgrammesRegistered(ArrayList<String> programmesRegistered) {
		this.programmesRegistered = programmesRegistered;
	}

}
