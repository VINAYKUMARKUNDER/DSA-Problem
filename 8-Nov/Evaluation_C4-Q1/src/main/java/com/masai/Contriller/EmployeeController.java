package com.masai.Contriller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.EmployeeException;
import com.masai.Model.Employee;
import com.masai.Model.EmployeeDTO;
import com.masai.Model.Login;
import com.masai.service.EmployeeServises;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServises eService;
	
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp) throws EmployeeException{
		Employee e =eService.registerEmployee(emp);
		return new ResponseEntity<Employee>(e,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("employee/{id}")
	public ResponseEntity<Employee> findById(@PathVariable("id") Integer id) throws EmployeeException{
		
		Employee emp=eService.getEmployeeById(id);
		return new ResponseEntity<Employee>(emp,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> findAll() throws EmployeeException{
		
		List<Employee> list=eService.getAllEmployeeDetails();
		return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
	}
	
	@DeleteMapping("employee/{id}")
	public ResponseEntity<Employee> deleteById(@PathVariable("id") Integer id) throws EmployeeException{
		
		Employee emp= eService.deleteEmployeeById(id);
		
		return new ResponseEntity<Employee>(emp,HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/employee")
	public ResponseEntity<Employee> updateById(@RequestBody Employee emp) throws EmployeeException{
		
		Employee e=	eService.updateEmployee(emp);
		return new ResponseEntity<Employee>(e,HttpStatus.ACCEPTED);
	}
	
	
	@GetMapping("getemployee/{id}")
	public ResponseEntity<String> getNameAndAddressWithId(@PathVariable("id") Integer id) throws EmployeeException{
		
		String str=eService.getNameAndAddressOfEmplyeeById(id);
		
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	
	@GetMapping("getallemployee/{address}")
	public ResponseEntity<List<Employee>> findByAddress(@PathVariable String address) throws EmployeeException{
		List<Employee> list=eService.getEmployeeDetailsByAddress(address);
		
		return new ResponseEntity<List<Employee>>(list,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("getalldata")
	public ResponseEntity<List<EmployeeDTO>> getData() throws EmployeeException{
		
		List<EmployeeDTO> list1 =eService.getNameAddressSalaryOfAllEmployee();
		
		return new ResponseEntity<List<EmployeeDTO>>(list1,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("login")
	public ResponseEntity<Employee> loginData(@RequestBody Login login) throws EmployeeException{
		Employee emp= eService.loginEmployee(login.getEmail(), login.getPassword());
		
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	
	}

}
