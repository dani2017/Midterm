package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {
	private static UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor major;
	
	public Course(UUID CourseID, String CourseName, int GradePoints) {
		
	}

	// Getter & Setter
	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public int getGradePoints() {
		return GradePoints;
	}

	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}

	public eMajor getMajor() {
		return major;
	}

	public void setMajor(eMajor major) {
		this.major = major;
	}

	public static UUID getCourseID() {
		return CourseID;
	}

	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
}
