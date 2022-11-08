package com.masai.repositiry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.Model.Employee;
import com.masai.Model.EmployeeDTO;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
	@Query("from Employee where address= ?1")
	public List<Employee> findByAddress(String address);
	
	@Query("select new com.masai.Model.EmployeeDTO(e.empName,e.address,e.salary) from Employee e")
	public List<EmployeeDTO> getNameAddress();
	
	@Query("select new com.masai.Model.Login(e.email,e.password) from Employee e")
	public Employee login(String email, String password);

}
