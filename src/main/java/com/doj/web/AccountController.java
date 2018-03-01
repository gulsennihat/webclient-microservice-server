/**
 * 
 */
package com.doj.web;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author Dinesh.Rajput
 *
 */
//@Controller
@RestController
public class AccountController {
	
	@Autowired
	AccountRepository accountRepository;
	
// 	@RequestMapping("/")
// 	public String home(){
// 		return "index";
// 	}
// 	@RequestMapping("/accountList")
// 	public String accountList(Model model) {
// 		model.addAttribute("accounts", accountRepository.getAllAccounts());
// 		return "accountList";
// 	}
	
// 	@RequestMapping("/accountDetails")
// 	public String accountDetails(@RequestParam("number") String id, Model model) {
// 		model.addAttribute("account", accountRepository.getAccount(id));
// 		return "accountDetails";
// 	}
	
	@RequestMapping("/accountList-rest")
	public List<Account> accountList(Model model) {
		return accountRepository.getAllAccounts();
	}
}
