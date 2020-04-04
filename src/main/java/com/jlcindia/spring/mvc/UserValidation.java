package com.jlcindia.spring.mvc;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


@Component
public class UserValidation implements Validator {

	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	public void validate(Object command, Errors errors) {
		User user = (User) command;
		String un=user.getUsername();
		String pw=user.getPassword();
		if (un.length() == 0 || un == null) {
			errors.rejectValue("username", "error.username.reuired", null, "Username Mandatory.");
		}
		if (pw == null || pw.length() == 0) {
			errors.rejectValue("password", "error.password.reuired", null, "Password Mandatory.");
		}
		
	}

	}
