package com.mycompany.app;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;

import org.joda.time.LocalDate;
import org.junit.Before;
import org.junit.Test;

public class ModuleTest {
	
	private String moduleName = "SoftwareEng";
    private String moduleId = "CT419";
    private String courseName = "CS & IT";
    
    private LocalDate startDate = new LocalDate(2019, 9, 14);
    private LocalDate endDate = new LocalDate(2020, 1, 16);
    
    private Student newStudent1 = new Student("David", 21, 124578);
    private Student newStudent2 = new Student("Aoife", 20, 235689);
    
    private Module newModule = new Module(moduleName, moduleId);
    
    private ArrayList<Module> modulesRegistered;
    private ArrayList<Student> studentsRegistered;
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
    	ArrayList<Student> testStudents = new ArrayList<Student>();
    	testStudents.add(newStudent1);
    	testStudents.add(newStudent2);
    	
    	Module testModule = new Module("SoftwareEng", "CT419", testStudents, courses);
    	testModule.addStudents(newStudent1);
    	testModule.addStudents(newStudent2);
    	
    	assertThat(testModule.getStudentsRegistered(), is(testStudents)); 
    }
    
    @Test
    public void shouldAddCourse() {
    	newModule.addCourses(newProgramme);
    	
    	assertThat(newModule.getCoursesRegistered(), is(courses));
    }

}
