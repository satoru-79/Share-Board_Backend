package com.example.demo.service;

import java.util.List;

import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PresetInfo;
import com.example.demo.form.PresetForm;
import com.example.demo.repository.PresetInfoRepository;

import lombok.RequiredArgsConstructor;

/**
 * ログイン画面 Service
 * 
 * @author yajimaseiryu
 * 
 */
@Service
@RequiredArgsConstructor
public class PresetService {
	
	/* プリセット情報テーブル DAO**/
	private final PresetInfoRepository repository;
	
	/** Dozer Mapper */
	private final Mapper mapper;
	
//	/** PasswordEncoder*/
//	private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	/**
	 * プリセット情報テーブル 新規登録
	 * 
	 * @param form 登録するプリセット情報
	 */
	public void resistPresetInfo(PresetForm form) {
		
		var presetInfo = mapper.map(form, PresetInfo.class);
		repository.save(presetInfo);
	}
	
	/**
	 * プリセット情報テーブル ユーザー名絞り込み
	 * 
	 * @param username 絞り込みたいユーザーのユーザー名
	 * @return 絞り込み結果リスト
	 */
	public List<PresetInfo> filterByUsername(String username) {

		return repository.findByUsername(username);
	}
	
	public void deletePresetById(String presetId) {
		repository.deleteById(presetId);
	}
}

