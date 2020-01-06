package com.deloitte.emp.HibernateIn;
import javax.persistence.*;
@Entity
public class SystemEngineer extends Employee2{
	
	 
	private String lang;
	private String devProfile;
	
	public SystemEngineer()
	{
		
	}
	public SystemEngineer(int empId, String empNmae, int seId, String lang, String devProfile) {
		
	 
		this.lang = lang;
		this.devProfile = devProfile;
	}
	 
	@Override
	public String toString() {
		return "SystemEngineer [lang=" + lang + ", devProfile=" + devProfile + "]";
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getDevProfile() {
		return devProfile;
	}
	public void setDevProfile(String devProfile) {
		this.devProfile = devProfile;
	}
	 

}