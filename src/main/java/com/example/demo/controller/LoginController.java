package com.example.demo.controller;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.form.LoginForm;
import com.example.demo.service.LoginService;
import com.example.demo.service.TokenService;

import lombok.RequiredArgsConstructor;

/**
 * ログイン画面 コントローラ
 * 
 * @author yajimaseiryu
 */
@RestController
@RequiredArgsConstructor
public class LoginController {
	
	/** ログイン画面 service*/
	private final LoginService service;
	
	/** PasswordEncoder*/
	private final PasswordEncoder passwordEncoder;
	
	/** トークン作成サービス*/
	private final TokenService tokenService;
	
	/**
	 * 
	 * @param form 入力情報
	 * @return ログイン成功でユーザー名、失敗で""
	 */
	@PostMapping("/api/public/login")
	public String login(@RequestBody LoginForm form) {
		var userInfo = service.searchUserById(form.getUsername());
		var isCorrectUserAuth = userInfo.isPresent() 
				&& passwordEncoder.matches(form.getPassword(), userInfo.get().getPassword());;		
		if (isCorrectUserAuth) {
			return tokenService.generateToken(form.getUsername());
		} else {
			return "";
		}
	}
}
