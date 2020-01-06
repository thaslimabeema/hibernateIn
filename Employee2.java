package com.deloitte.emp.HibernateIn;
import javax.persistence.*;

@Entity

public class Employee2 {
	public Employee2() 
	{
		
	}

	public Employee2(int empId, String empNmae)
	{

		this.empId = empId;
		this.empNmae = empNmae;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpNmae() {
		return empNmae;
	}
	public void setEmpNmae(String empNmae) {
		this.empNmae = empNmae;
	}
	@Id
	private int empId;
	private String empNmae;
}