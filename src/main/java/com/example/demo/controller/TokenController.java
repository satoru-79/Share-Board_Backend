package com.example.demo.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

/**
 * ログイン画面 コントローラ
 * 
 * @author yajimaseiryu
 */
@RestController
@RequiredArgsConstructor
public class TokenController {
	
	
	/**
	 * クライアントが持っているトークンがまだ有効か調べる
	 * 
	 */
	@PostMapping("/api/checkAuth")
	public void postToken() {
		
	}
	
	
}
