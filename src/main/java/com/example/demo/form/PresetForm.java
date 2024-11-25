package com.example.demo.form;

import lombok.Data;

/**
 * プリセット登録画面 フォーム
 * 
 * @author yajimaseiryu
 */
@Data
public class PresetForm {
	
	/** presetId*/
	private String presetId;
	
	/** タイトル*/
	private String title;
	
	/** 作成ユーザー名*/
	private String username;
	
	/** プリセットの中身*/
	private String players;
}
