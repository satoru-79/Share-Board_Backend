package com.example.demo.form;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

/**
 * ユーザ登録画面 form
 * 
 * @author yajimaseiryu
 * 
 */
@Data
public class SignupForm {

	/** ログインID*/
	@Length(min = 1, max = 15)
	private String username;
	
	/** パスワード*/
	@Length(min = 8, max = 20)
	private String password;
}
