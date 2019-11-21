package com.mycompany.app;

import java.util.ArrayList;

public class Module {
	
	//Instance Variables
	String name;
	String idCode;
	ArrayList<Student> studentsRegistered = new ArrayList<>();
	ArrayList<Programme> coursesRegistered = new ArrayList<>();
	
	// Constructor
	public Module(String name, String idCode,
			ArrayList<Student> studentsRegistered,
			ArrayList<Programme> coursesRegistered) {
		super();
		this.name = name;
		this.idCode = idCode;
		this.studentsRegistered = studentsRegistered;
		this.coursesRegistered = coursesRegistered;
	}

	public Module(String moduleName, String moduleId) {
		this.name = moduleName;
		this.idCode = moduleId;
	}

	public String getName() {
		return name;
	}

	public String getIdCode() {
		return idCode;
	}
	
	public ArrayList<Student> getStudentsRegistered() {
		return studentsRegistered;
	}
	
	
	public ArrayList<Programme> getCoursesRegistered() {
		return coursesRegistered;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIdCode(String idCode) {
		this.idCode = idCode;
	}

	public void setStudentsRegistered(ArrayList<Student> studentsRegistered) {
		this.studentsRegistered = studentsRegistered;
	}

	public void setCoursesRegistered(ArrayList<Programme> coursesRegistered) {
		this.coursesRegistered = coursesRegistered;
	}

}
