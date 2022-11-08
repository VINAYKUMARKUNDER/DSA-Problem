package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer accountNo;
	private String accountHolderName;
	private String address;
	private String email;
	private Integer balance;
	private String mobile;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(Integer accountNo, String accountHolderName, String address, String email, Integer balance,
			String mobile) {
		super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.address = address;
		this.email = email;
		this.balance = balance;
		this.mobile = mobile;
	}

	public Integer getAccountNo() {
		return accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public Integer getBalance() {
		return balance;
	}

	public String getMobile() {
		return mobile;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", address=" + address
				+ ", email=" + email + ", balance=" + balance + ", mobile=" + mobile + "]";
	}
	
	
	

}
