package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

/**
 * ユーザ情報テーブル Entity
 * 
 * @author yajimaseiryu
 * 
 */
@Entity
@Table(name="user_info")
@Data
public class UserInfo {
	
	/** ログインID*/
	@Id
	@Column(name = "username")
	private String username;
	
	/** パスワード*/
	private String password;
	
}
