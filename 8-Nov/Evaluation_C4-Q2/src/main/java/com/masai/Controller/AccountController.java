package com.masai.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.AccountException;
import com.masai.model.Account;
import com.masai.service.AccoService;

@RestController
public class AccountController {
	
	@Autowired
	private AccoService aService;
	
	@PostMapping("/account")
	public ResponseEntity<Account> openAccount(@RequestBody Account acc) throws AccountException{
		
		Account ac=	aService.openAccount(acc);
		
		return new ResponseEntity<Account>(ac,HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/account/{acc}")
	public ResponseEntity<Account> closeAc(@PathVariable("acc") Integer acc) throws AccountException{
		Account ac= aService.closeAccount(acc);
		
		return new ResponseEntity<Account>(ac,HttpStatus.OK);
	}
	
	
	@PutMapping("account/{acc}")
	public ResponseEntity<Account> updateBalence(@PathVariable("acc") Integer accno, @RequestParam("balance") Integer amount) throws AccountException{
		
		Account ac= aService.depositAmount(accno, amount);
		
		return new ResponseEntity<Account>(ac,HttpStatus.ACCEPTED);
		
	}
	
	@PutMapping("withaccount/{acc}")
	public ResponseEntity<Account> withBalence(@PathVariable("acc") Integer accno, @RequestParam("balance") Integer amount) throws AccountException{
		
		Account ac= aService.depositAmount(accno, amount);
		
		return new ResponseEntity<Account>(ac,HttpStatus.ACCEPTED);
		
	}
	

}
