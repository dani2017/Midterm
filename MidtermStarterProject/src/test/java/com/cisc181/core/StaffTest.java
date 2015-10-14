package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class StaffTest {
	
	static ArrayList<Staff> listStaff = new ArrayList<Staff>();
	
	@BeforeClass
	public static void Faculty(){
		
		listStaff.add(new Staff("Diane", "Maddie", "Foster", new Date(), "382 Delaware Ave, Newark, DE, 19717", 
				"(392) 284-4827", "dianefos@school.edu", "2-4", 4, 12000.2, new Date(), eTitle.PROFESSOR));
		listStaff.add(new Staff("Diane", "Maddie", "Foster", new Date(), "382 Delaware Ave, Newark, DE, 19717", 
				"(392) 284-4827", "dianefos@school.edu", "2-4", 4, 18500.2, new Date(), eTitle.PROFESSOR));
		listStaff.add(new Staff("Diane", "Maddie", "Foster", new Date(), "382 Delaware Ave, Newark, DE, 19717", 
				"(392) 284-4827", "dianefos@school.edu", "2-4", 4, 20000.2, new Date(), eTitle.PROFESSOR));
		listStaff.add(new Staff("Diane", "Maddie", "Foster", new Date(), "382 Delaware Ave, Newark, DE, 19717", 
				"(392) 284-4827", "dianefos@school.edu", "2-4", 4, 15000.2, new Date(), eTitle.PROFESSOR));
		listStaff.add(new Staff("Diane", "Maddie", "Foster", new Date(), "382 Delaware Ave, Newark, DE, 19717", 
				"(392) 284-4827", "dianefos@school.edu", "2-4", 4, 16900.2, new Date(), eTitle.PROFESSOR));
	}
	
	
	@Test
	public void testSalaryAvg() {
		double sum = 0;
		double avg = 0;
		for (Staff staff : listStaff){
			sum += staff.getSalary();
		}
		avg = sum/listStaff.size();
		assertTrue(16480.2 == avg);
	}

}
