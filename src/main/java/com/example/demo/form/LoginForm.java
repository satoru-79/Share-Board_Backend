package com.example.demo.form;

import lombok.Data;

/**
 * ログイン画面 フォーム
 * 
 * @author yajimaseiryu
 */
@Data
public class LoginForm {
	
	/** ユーザー名*/
	private String username;
	
	/** パスワード*/
	private String password;
}
