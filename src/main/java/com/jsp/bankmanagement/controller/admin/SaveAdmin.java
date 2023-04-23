package com.jsp.bankmanagement.controller.admin;

import com.jsp.bankmanagement.dto.BankAdmin;
import com.jsp.bankmanagement.service.BankAdminService;

public class SaveAdmin {
	
	public static void main(String[] args) {
BankAdmin bankAdmin = new BankAdmin();
		
		bankAdmin.setAdminName("Rushali");
		bankAdmin.setAdminEmail("Rushali@gmail.com");
		bankAdmin.setPhone("9990202020");
		
		BankAdminService bankAdminService=new BankAdminService();
		bankAdminService.saveBankAdmin(bankAdmin);
	}

}
