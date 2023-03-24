package com.Flight.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Flight.Entities.User;
import com.Flight.Repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	//http://localhost:8080/showLoginPage
	@RequestMapping("/showLoginPage")
	public String showLoginPage() {
		return "Login/Login";
	}

	//http://localhost:8080/showReg
	@RequestMapping("/showReg")
	public String showReg() {
		return "Login/showReg";
	}
	
	@RequestMapping("/saveReg")
	public String saveReg(@ModelAttribute("User") User user) {
		userRepo.save(user);
		return "Login/Login";
	}
	
	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("emailId") String emailId, @RequestParam("password") String password,Model model) {
		User user = userRepo.findByEmail(emailId);
		if(user!= null) {
		if(user.getEmail().equals(emailId) & user.getPassword().equals(password)) {
			return "findFlights";
		}else {
			model.addAttribute("Error", "Invalid username / password");
			return "Login/Login";
		  }
		}else {
			model.addAttribute("Error", "Invalid username / password");
			return "Login/Login";
		}
	}	
}	
		
	

