package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.EmployeeException;
import com.masai.Model.Employee;
import com.masai.Model.EmployeeDTO;
import com.masai.repositiry.EmployeeRepo;

@Service
public class serviceImpl implements  EmployeeServises{
	
	@Autowired
	private EmployeeRepo eRepo;

	@Override
	public Employee registerEmployee(Employee emp) throws EmployeeException {
		
		if(eRepo.save(emp) != null) {
			return emp;
		}else throw new EmployeeException("Register failed.");

	}

	@Override
	public Employee getEmployeeById(Integer empId) throws EmployeeException {
		
		Optional<Employee> emp=eRepo.findById(empId);
		
		if(emp.isPresent())return emp.get();
		else throw new EmployeeException("Employee is not found with id : "+empId);
	}

	@Override
	public List<Employee> getAllEmployeeDetails() throws EmployeeException {
		
		List<Employee> list=eRepo.findAll();
		if(list.size()==0)throw new EmployeeException("Database is empty..");
		return list;
	}

	@Override
	public Employee deleteEmployeeById(Integer empId) throws EmployeeException {
		
		Optional<Employee> emp=eRepo.findById(empId);
		
		if(emp.isPresent()) {
			eRepo.delete(emp.get());
			return emp.get();
		}else throw new EmployeeException("This id does not Exist..");
		
		
	}

	@Override
	public Employee updateEmployee(Employee emp) throws EmployeeException {
		Optional<Employee> em=eRepo.findById(emp.getEmpId());
		
		if(em.isPresent()) {
			eRepo.save(emp);
			return emp;
		}else throw new EmployeeException("Id does not Exsit.");
		
	}

	@Override
	public String getNameAndAddressOfEmplyeeById(Integer empId) throws EmployeeException {
			Optional<Employee> em=eRepo.findById(empId);
		
		if(em.isPresent()) {
			
			Employee e=em.get();
			
			String msg= "Name : "+e.getEmpName()+" Snd Address is : "+e.getAddress();
			
			return msg;
			
		}else throw new EmployeeException("Id does not Exsit.");
	}

	@Override
	public List<Employee> getEmployeeDetailsByAddress(String address) throws EmployeeException {
		
		List<Employee> list=eRepo.findByAddress(address);
		
		if(list.size()==0)throw new EmployeeException("There no any such Data.");
		else return list;
	}

	@Override
	public List<EmployeeDTO> getNameAddressSalaryOfAllEmployee() throws EmployeeException {
		List<EmployeeDTO> list=eRepo.getNameAddress();
		if(list.size()==0)throw new EmployeeException("There no any such Data.");
		else return list;
	}

	@Override
	public Employee loginEmployee(String email, String password) throws EmployeeException {
		
			Employee emp=	eRepo.login(email, password);
			
			if(emp==null)throw new EmployeeException("Employee not found..");
			else return emp;
	}

	

}
