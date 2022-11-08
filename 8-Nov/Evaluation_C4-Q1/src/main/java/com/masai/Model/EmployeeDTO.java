package com.masai.Model;

public class EmployeeDTO {
	
	private String empName;
	private String address;
	private Integer salary;
	
	public EmployeeDTO() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeDTO(String empName, String address, Integer salary) {
		super();
		this.empName = empName;
		this.address = address;
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public String getAddress() {
		return address;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [empName=" + empName + ", address=" + address + ", salary=" + salary + "]";
	}

	
	

}
