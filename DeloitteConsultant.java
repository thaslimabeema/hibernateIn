package com.deloitte.emp.HibernateIn;
import javax.persistence.*;

@Entity
public class DeloitteConsultant extends Employee2 {
	public DeloitteConsultant() {}
	
	public DeloitteConsultant(String empNmae, int dcId, String testTech, String testProfile) {
		
		 
		this.testTech = testTech;
		this.testProfile = testProfile;
	}

	 

	@Override
	public String toString() {
		return "DeloitteConsultant [testTech=" + testTech + ", testProfile=" + testProfile + "]";
	}

	public String getTestTech() {
		return testTech;
	}

	public void setTestTech(String testTech) {
		this.testTech = testTech;
	}

	public String getTestProfile() {
		return testProfile;
	}

	public void setTestProfile(String testProfile) {
		this.testProfile = testProfile;
	}

	private String testTech;
	
	private String testProfile;

}