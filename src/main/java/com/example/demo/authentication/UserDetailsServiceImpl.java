package com.example.demo.authentication;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.demo.repository.UserInfoRepository;

import lombok.RequiredArgsConstructor;

/**
 * ユーザー情報生成
 * 
 * @author yajimaseiryu
 */
@Component
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

	/** ユーザー情報テーブルRepository*/
	private final UserInfoRepository repository;
	
	/**
	 * ユーザー情報生成
	 * 
	 * @param username ユーザー名
	 * @throws UsernameNotFoundException
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		var UserInfo = repository.findById(username)
				.orElseThrow(() -> new UsernameNotFoundException(username));
			
			return User.withUsername(UserInfo.getUsername())
					.password(UserInfo.getPassword())
					.roles("USER")
					.build();
	}

}
