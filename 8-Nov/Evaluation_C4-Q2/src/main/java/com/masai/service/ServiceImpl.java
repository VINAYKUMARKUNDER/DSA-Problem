package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.AccountException;
import com.masai.Exception.InsufficientFundException;
import com.masai.Repo.AccountRepo;
import com.masai.model.Account;
import com.masai.model.AccountDTO;


@Service
public class ServiceImpl implements AccoService{
	
	@Autowired
	private AccountRepo aRepo;

	@Override
	public Account openAccount(Account acc) throws AccountException {
		if(aRepo.save(acc)!=null) {
		return acc;
		}else throw new AccountException("Data is wrong..");
	}

	@Override
	public Account closeAccount(Integer accno) throws AccountException {
		Optional<Account> ac= aRepo.findById(accno);
		
		if(ac.isPresent()) {
			aRepo.delete(ac.get());
			return ac.get();
		}else throw new AccountException("Account is not Exist..");
	}

	@Override
	public Account depositAmount(Integer accno, Integer amount) throws AccountException {
		Optional<Account> ac= aRepo.findById(accno);
		
		if(ac.isPresent()) {
			Account account=ac.get();
			account.setBalance(account.getBalance()+amount);
					
			aRepo.save(account);
			return account;
		}else throw new AccountException("Account is not Exist..");
	}

	@Override
	public Account withdrawAmount(Integer accno, Integer amount) throws AccountException, InsufficientFundException {
Optional<Account> ac= aRepo.findById(accno);
		
		if(ac.isPresent()) {
			Account account=ac.get();
			account.setBalance(account.getBalance()-amount);
			
			if(account.getBalance()<=0)throw new InsufficientFundException("Balene nahi hai.");
					
			aRepo.save(account);
			return account;
		}else throw new AccountException("Account is not Exist..");
	}

	@Override
	public String transferAmount(AccountDTO dto) throws AccountException, InsufficientFundException {
		// TODO Auto-generated method stub
		return null;
	}

}
