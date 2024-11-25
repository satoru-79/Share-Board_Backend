package com.example.demo.controller;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.form.SignupForm;
import com.example.demo.service.SignupService;

import lombok.RequiredArgsConstructor;

/**
* ユーザ登録画面 Controller
* 
* @author yajimaseiryu
*  */

@RestController
@RequiredArgsConstructor
public class SignupController {
	
	/** ユーザー登録画面 service*/
	private final SignupService service;
	
	/**
	 * 
	 * @param form 新規登録するユーザー情報
	 * @return 登録したユーザー情報
	 */
	@PostMapping("/api/public/signup")
	public String login(@Validated @RequestBody SignupForm form, BindingResult bdResult){
		if (bdResult.hasErrors()) {
			var fieldName = bdResult.getFieldError().getField();
			if (fieldName.equals("username")) {
				fieldName = "ユーザー名";
			} else {
				fieldName = "パスワード";
			}
			var errorMsg = fieldName + bdResult.getFieldError().getDefaultMessage();
			return errorMsg;
		}
		var userInfoOpt = service.resistUserInfo(form);
		return userInfoOpt;
		
	}
}
