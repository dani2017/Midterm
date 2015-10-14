package com.cisc181.core;

import java.util.UUID;

public class Section {
	private UUID CourseID;
	private UUID SemesterID;
	private static UUID SectionID;
	private int RoomID;
	
	// Getter & Setter
	public static UUID getSectionID() {
		return SectionID;
	}
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
	public int getRoomID() {
		return RoomID;
	}
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}

	public UUID getCourseID() {
		return CourseID;
	}
	
	public void setCourseID() {
		CourseID = Course.getCourseID();
	}

	public UUID getSemesterID() {
		return SemesterID;
	}
	
	public void setSemesterID() {
		SemesterID = Semester.getSemesterID();
	}


}
