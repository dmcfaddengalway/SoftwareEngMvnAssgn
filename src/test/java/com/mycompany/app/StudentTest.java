package com.mycompany.app;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import org.joda.time.LocalDate;

import org.junit.*;
import java.util.*;

public class StudentTest {

	private String studentName = "Daniel";
    private int studentAge = 22;
    private int studentID = 13579;
    
    private String moduleName = "SoftwareEng";
    private String moduleId = "CT419";
    private String courseName = "CS & IT";
    
    private LocalDate startDate = new LocalDate(2019, 9, 14);
    private LocalDate endDate = new LocalDate(2020, 1, 16);
    
    private Student newStudent1 = new Student(studentName, studentAge, studentID);
    
    private Module newModule = new Module(moduleName, moduleId);
    
    private ArrayList<Student> studentsRegistered;
    private ArrayList<Module> modulesRegistered;
    private ArrayList<Programme> courses;
    
    private Programme newProgramme = new Programme(courseName, modulesRegistered, studentsRegistered, startDate, endDate);
  
    @Before
    public void init() {
    	studentsRegistered = new ArrayList<>();
        studentsRegistered.add(newStudent1);
        
        modulesRegistered = new ArrayList<>();
        modulesRegistered.add(newModule);
        
        courses = new ArrayList<>();
        courses.add(newProgramme);     
    }
    
    @Test
    public void shouldGetStudentName() {
        assertThat(studentName, is(newStudent1.getName()));
    }
    @Test
    public void shouldGetStudentAge() {
        assertThat(studentAge, is(newStudent1.getAge()));
    }
 
    @Test
    public void shouldGetUserName() {
        assertThat(studentName + studentAge, is(newStudent1.getUsername()));
    }

    @Test
    public void shouldGetId() {
        assertThat(studentID, is(newStudent1.getStudentID()));
    }

}
