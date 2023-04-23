package com.jsp.bankmanagement.controller.manager;

import com.jsp.bankmanagement.dto.BankManager;
import com.jsp.bankmanagement.service.BankManagerService;

public class SaveManager {
	
	public static void main(String[] args) {
		BankManager bankManager=new BankManager();
		bankManager.setManagerName("Rushikesh");
		bankManager.setManagerEmail("rushikesh@gmail.com");
		bankManager.setDesignation("Manager");
		bankManager.setStatus("Unapproved");
		BankManagerService bankManagerService = new BankManagerService();
		bankManagerService.saveBankManager(bankManager);
	}

}
