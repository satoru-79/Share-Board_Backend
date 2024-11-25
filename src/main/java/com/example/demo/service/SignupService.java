package com.example.demo.service;

import org.dozer.Mapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserInfo;
import com.example.demo.form.SignupForm;
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
public class SignupService {
	
	/* ユーザー情報テーブル DAO**/
	private final UserInfoRepository repository;
	
	/** Dozer Mapper */
	private final Mapper mapper;
	
	/** PasswordEncoder*/
	private final PasswordEncoder passwordEncoder;
	
	/**
	 * ユーザ情報テーブル 新規登録
	 * 
	 * @param loginId ログインID
	 * @return 登録情報(ユーザー情報Entity)、すでに同じユーザIDで登録がある場合はEmpty
	 */
	public String resistUserInfo(SignupForm form) {
		var userInfoExsistedOpt = repository.findById(form.getUsername());
		if (userInfoExsistedOpt.isPresent()) {
			return "existUserName";
		}

		var userInfo = mapper.map(form, UserInfo.class);
		var encodedPassword = passwordEncoder.encode(form.getPassword());
		userInfo.setPassword(encodedPassword);
		repository.save(userInfo);
		return "success";
	}
}
