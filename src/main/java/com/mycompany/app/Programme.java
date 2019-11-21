package com.mycompany.app;

import java.util.ArrayList;
import org.joda.time.*;

public class Programme {

	// Instance Variables
	String courseName;
	ArrayList<Module> modules = new ArrayList<>();
	ArrayList<Student> studentsRegistered = new ArrayList<>();
	DateTime startDate;
	DateTime endDate;
	
	// Constructor
	public Programme(String courseName, ArrayList<Module> modules,
			ArrayList<Student> studentsRegistered, DateTime startDate,
			DateTime endDate) {
		super();
		this.courseName = courseName;
		this.modules = modules;
		this.studentsRegistered = studentsRegistered;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getCourseName() {
		return courseName;
	}

	public ArrayList<Module> getModules() {
		return modules;
	}

	public ArrayList<Student> getStudentsRegistered() {
		return studentsRegistered;
	}

	public DateTime getStartDate() {
		return startDate;
	}

	public DateTime getEndDate() {
		return endDate;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}

	public void setStudentsRegistered(ArrayList<Student> studentsRegistered) {
		this.studentsRegistered = studentsRegistered;
	}

	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
	
}
