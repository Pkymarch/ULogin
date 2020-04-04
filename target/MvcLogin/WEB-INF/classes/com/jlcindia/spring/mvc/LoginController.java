package com.jlcindia.spring.mvc;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes
public class LoginController {
	
	@Autowired
	UserValidation userValidation;

	@GetMapping("/login.jlc")
	public String showLogin(Model model) throws ServletException {
		User user = new User();
		model.addAttribute("myuser", user);
		return "login";
	}

	@PostMapping("/register.jlc")
	public String saveData(@ModelAttribute("myuser") User user, BindingResult result) {
		System.out.println("User-Validation");
		userValidation.validate(user,result);

		if (result.hasErrors()) {
			System.out.println(result.getErrorCount());
			return "login";
		}

		String un = user.getUsername();
		String pw = user.getPassword();
		if (un.equals(pw))
			return "home";
		return "login";
	}
}
