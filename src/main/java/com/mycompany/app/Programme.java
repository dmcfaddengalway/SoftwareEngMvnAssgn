package com.mycompany.app;

import java.util.ArrayList;
import org.joda.time.*;

public class Programme {

	// Instance Variables
	String courseName;
	ArrayList<Module> modules = new ArrayList<>();
	ArrayList<Student> studentsRegistered = new ArrayList<>();
	LocalDate startDate;
	LocalDate endDate;
	
	// Constructor
	public Programme(String courseName, ArrayList<Module> modules,
			ArrayList<Student> studentsRegistered, LocalDate startDate,
			LocalDate endDate) {
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

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
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

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
}
