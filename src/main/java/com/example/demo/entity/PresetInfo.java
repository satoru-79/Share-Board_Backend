package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

/**
 * プリセット情報テーブル Entity
 * 
 * @author yajimaseiryu
 * 
 */
@Entity
@Table(name="preset_info")
@Data
public class PresetInfo {
	
	/** 主キー*/
	@Id
	@Column(name = "presetId")
	private String presetId;
	
	/** 作成ユーザー名*/
	@Column(name = "username")
	private String username;
	
	/** プリセットのタイトル*/
	@Column(name = "title")
	private String title;
	
	/** プリセットの中身*/
	@Column(name = "players")
	private String players;

}
