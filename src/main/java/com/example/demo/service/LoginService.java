package com.example.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.UserInfo;
import com.example.demo.repository.UserInfoRepository;

import lombok.RequiredArgsConstructor;

/**
 * ログイン画面 Service
 * 
 * @author yajimaseiryu
 * 
 */
@Service
@RequiredArgsConstructor
public class LoginService {
	
	/* ユーザー情報テーブル DAO**/
	private final UserInfoRepository repository;
	
	/**
	 * ユーザ情報テーブル主キー検索
	 * @param loginId ログインID
	 * @return ユーザ情報テーブル主キー検索の結果(1件)
	 */
	public Optional<UserInfo> searchUserById(String username) {
		
		return repository.findById(username);
	}
}
