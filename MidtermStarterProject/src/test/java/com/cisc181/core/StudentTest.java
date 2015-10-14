package com.cisc181.core;

import static org.junit.Assert.*;

import com.cisc181.core.Course;

import java.util.ArrayList;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

public class StudentTest {

	static ArrayList<Course> listCourse = new ArrayList<Course>();
	static ArrayList<Semester> listSemester = new ArrayList<Semester>();
	static ArrayList<Section> listSection = new ArrayList<Section>();
	static ArrayList<Student> listStudent = new ArrayList<Student>();
	static ArrayList<Enrollment> listEnrollment = new ArrayList<Enrollment>();
	
	@BeforeClass
	public static void SetUp(){
		listCourse.add(new Course(UUID.randomUUID(), "Math520", 90));
		listCourse.add(new Course(UUID.randomUUID(), "CISC304", 100));
		listCourse.add(new Course(UUID.randomUUID(), "PSYC100", 85));
		
		
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
