package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

/**
 * ボード情報テーブル Entity
 * 
 * @author yajimaseiryu
 * 
 */
@Entity
@Table(name="board_info")
@Data
public class BoardInfo {
	
	/** 主キー*/
	@Id
	@Column(name = "boardId")
	private String boardId;
	
	/** 作成ユーザー名*/
	@Column(name = "userName")
	private String userName;
	
	/** 攻守*/
	@Column(name = "boardType")
	private String boardType;
	
	/** タイトル*/
	@Column(name = "title")
	private String title;
	
	/** 公開の有無*/
	@Column(name = "ispublic")
	private String ispublic;
	
	/** いいねの数*/
	@Column(name = "goods")
	private String goods;
	
	/** ボードの詳細情報*/
	@Column(name = "boards")
	private String boards;

}
