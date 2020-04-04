package com.jlcindia.spring.mvc;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


@Component
public class UserValidation implements Validator {

	@Override
	public boolean supports(Class clazz) {
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object command, Errors errors) {
		User user = (User) command;
		String un=user.getUsername();
		String pw=user.getPassword();
		if (un.length() == 0 || un == null) {
			errors.rejectValue("username", "errors.required", new Object[] { "Username" }, "Username Mandatory.");
		} else if(un.length()<5) {
			errors.rejectValue("username", "errors.minLength", new Object[] { "Username" }, "Username minimum character must be 5.");
		} else if(un.length()>10) {
			errors.rejectValue("username", "errors.maxLength", new Object[] {"Username"}, "Username maximum characte should not be greater than 10.");
		}

		if (pw == null || pw.length() == 0) {
			errors.rejectValue("password", "errors.required", new Object[] { "Password" }, "Password Mandatory.");
		} else if(pw.length()<5) {
			errors.rejectValue("password", "errors.minLength", new Object[] { "Password" }, "Password minimum character must be 5.");
		} else if(pw.length()>10) {
			errors.rejectValue("password", "errors.maxLength", new Object[] {"Password"}, "Password maximum characte should not be greater than 10.");
		}
	}

}
