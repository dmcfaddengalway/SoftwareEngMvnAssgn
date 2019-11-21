package com.mycompany.app;

import org.joda.time.LocalDate;

import org.junit.*;
import java.util.*;

public class StudentTest {

	private String name = "Daniel";
    private int age = 22;
    private int id = 13579;
    
    private String moduleName = "SoftwareEng";
    private String moduleId = "CT419";
    private String courseName = "CS & IT";
    
    private LocalDate startDate = new LocalDate(2019, 9, 14);
    private LocalDate endDate = new LocalDate(2020, 1, 16);
    
    private Student newStudent1 = new Student(name, age, id);    
    
    private Module newModule = new Module(moduleName, moduleId);
    
    private ArrayList<Student> studentsRegistered;
    private ArrayList<Module> moduleRegistered;
    private ArrayList<Programme> courses;
    
    private Programme newProgramme = new Programme(courseName, moduleRegistered, studentsRegistered, startDate, endDate);
  
    @Before
    public void init() {
    	studentsRegistered = new ArrayList<Student>();
        studentsRegistered.add(newStudent1);
        moduleRegistered = new ArrayList<Module>();
        moduleRegistered.add(newModule);
        courses = new ArrayList<Programme>();
        courses.add(newProgramme);     
    }

}
