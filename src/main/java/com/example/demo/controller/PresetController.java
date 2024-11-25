package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.PresetInfo;
import com.example.demo.form.PresetForm;
import com.example.demo.service.PresetService;

import lombok.RequiredArgsConstructor;

/**
 * プリセット管理 コントローラ
 * 
 * @author yajimaseiryu
 */
@RestController
@RequiredArgsConstructor
public class PresetController {
	
	/** プリセット管理 service*/
	private final PresetService service;
	
	/**
	 * 
	 * @param username 取得したいプリセットの作成ユーザー名
	 * @return ユーザー名がら絞り込んだプリセットのリスト
	 */
	@GetMapping("/api/preset")
	public List<PresetInfo> getMyPreset(@RequestParam String username) {
		var presetInfo = service.filterByUsername(username);
		return presetInfo;
		
	}
	
	/**
	 * 
	 * @param form 作成するプリセットの情報
	 */
	@PostMapping("/api/preset/create")
	public void createPreset(@RequestBody PresetForm form) {
		service.resistPresetInfo(form);
		return;
	}
	
	/**
	 * 
	 * @param presetId 削除したいプリセットのId
	 */
	@PostMapping("/api/preset/delete")
	public void deletePreset(@RequestParam String presetId) {
		service.deletePresetById(presetId);
		return;
	}

}
