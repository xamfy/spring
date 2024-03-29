package com.ps.springmvc.psbankapp.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ps.springmvc.psbankapp.model.Account;
import com.ps.springmvc.psbankapp.services.AccountService;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

@Controller
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor ste = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, ste);
		
	}
	
	@RequestMapping("/")
	public String showHomePage() {
		return "index";
	}
	
	@RequestMapping("/new")
	public String newAccount(Model model) {
		model.addAttribute("account", new Account());
		return "account-form";
	}
	
	@RequestMapping("/showAccount")
	public String showAccount() {
		return "showAccount";
	}
	
	@RequestMapping(value="/saveAccount",
			method=RequestMethod.POST)
	public String saveAccount(
			@Valid @ModelAttribute("account") Account account,
			BindingResult result
			) {
//		String acNo = request.getParameter("accountNo");
//		String customerName = request.getParameter("accountHolderName");
//		String balance = request.getParameter("balance");
		
//		model.addAttribute("accountNumber", acNo);
//		model.addAttribute("accountHolderName", customerName);
//		model.addAttribute("balance", balance);
		
		
//		model.addAttribute("account", account);
//		
//		return "showAccount";
		
		if (result.hasErrors())
			return "account-form";
		else {
			accountService.saveAccount(account);
			return "redirect:/list";
		}
	}
	
	
	
}
