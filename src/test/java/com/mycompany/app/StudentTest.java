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
    private Student newStudent2 = new Student("David", 21, 124578);
    private Student newStudent3 = new Student("Aoife", 20, 235689);
    
    private Module newModule = new Module(moduleName, moduleId);
    
    private ArrayList<Student> studentsRegistered;
    private ArrayList<Module> moduleRegistered;
    private ArrayList<Programme> courses;
    
    private Programme newProgramme = new Programme(courseName, moduleRegistered, studentsRegistered, startDate, endDate);
  
    
    // Student Tests
    @Before
    public void init() {
    	studentsRegistered = new ArrayList<Student>();
        studentsRegistered.add(newStudent1);
        
        moduleRegistered = new ArrayList<Module>();
        moduleRegistered.add(newModule);
        
        courses = new ArrayList<Programme>();
        
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
    
    // Module Tests
    @Test
    public void shouldGetModuleName() {
    	assertThat(moduleName, is(newModule.getName()));
    }
    
    @Test
    public void shouldGetModuleId() {
    	assertThat(moduleId, is(newModule.getIdCode()));
    }
    
    @Test
    public void shouldAddStudent() {
    	newModule.addStudents(newStudent1);
    	
    	assertThat(newModule.getStudentsRegistered(), is(studentsRegistered));        
    }
    
    @Test
    public void shouldNotAddSameStudentTwice() {
    	ArrayList<Student> testList = new ArrayList<Student>();
    	testList.add(newStudent1);
    	testList.add(newStudent2);
    	
    	Module testModule = new Module("Programming", "CT320", testList, courses);
    	testModule.addStudents(newStudent1);
    	testModule.addStudents(newStudent2);
    	testModule.addStudents(newStudent3);
    	
    	assertThat(testModule.getStudentsRegistered(), is(testList)); 
    }
    
    @Test
    public void shouldAddCourse() {
    	newModule.addCourses(newProgramme);
    	
    	assertThat(newModule.getCoursesRegistered(), is(courses));
    }

}
