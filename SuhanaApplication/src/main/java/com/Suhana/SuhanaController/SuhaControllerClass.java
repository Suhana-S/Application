package com.Suhana.SuhanaController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Suhana.SuhanaModel.Holder;
import com.Suhana.SuhanaModel.Transaction;
import com.Suhana.SuhanaRepository.HolderRepository;
import com.Suhana.SuhanaRepository.TransactionRepository;

@Controller
public class SuhaControllerClass {
	
	@Autowired
	private TransactionRepository transactionrepo;
	@Autowired
	private HolderRepository accountHolderrepo;
	@RequestMapping("/")
	public String home(Model model)
	{
		List<Transaction> tran=new ArrayList<>();// List<accno,name,balance>
		transactionrepo.findByTop().forEach(tran::add);
		model.addAttribute("tran", tran);
		return "frontpage";
	}

	
	
	@RequestMapping("/transactionAmount") 
	public String transactionAmount(Holder accountHolder,Transaction transaction,@RequestParam("transAmt") int transactionAmount)
	{
		int temp=(int)transactionrepo.count();
		transaction.setTransId(temp+1);
		accountHolder=accountHolderrepo.getOne(121);
		int balance=accountHolder.getBalance()-transactionAmount;
		transaction.setTotalbalance(balance);
		transactionrepo.save(transaction);
		accountHolderrepo.updatebalance(balance, 121);
		return "redirect:/";
	}
	
}
