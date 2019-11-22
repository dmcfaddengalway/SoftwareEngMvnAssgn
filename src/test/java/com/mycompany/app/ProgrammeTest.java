package com.mycompany.app;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;

import org.joda.time.LocalDate;
import org.junit.Before;
import org.junit.Test;

public class ProgrammeTest {
	
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
    public void shouldGetCourseName() {
    	assertThat(courseName, is(newProgramme.getCourseName()));
    }
    
    @Test
    public void shouldGetStartDate() {
    	assertThat(startDate, is(newProgramme.getStartDate()));
    }
    
    @Test
    public void shouldGetEndDate() {
    	assertThat(endDate, is(newProgramme.getEndDate()));
    }
    
    @Test
    public void shouldAddModule() {
    	ArrayList<Module> newModules = new ArrayList<>();
    	newModules.add(newModule);
    	
    	newProgramme.setModules(newModules);
    	
    	assertThat(newProgramme.getModules(), is(newModules));
    }
    
    @Test
    public void shouldNotAddSameStudent() {
    	ArrayList<Student> testStudents = new ArrayList<Student>();
    	testStudents.add(newStudent1);
    	testStudents.add(newStudent2);
    	
    	Programme testProgramme = new Programme(courseName, modulesRegistered, studentsRegistered, startDate, endDate);
    	testProgramme.addStudents(newStudent1);
    	testProgramme.addStudents(newStudent2);
    	testProgramme.addStudents(newStudent2);
    	
    	assertThat(testProgramme.getStudentsRegistered(), is(testStudents)); 
    }

}
