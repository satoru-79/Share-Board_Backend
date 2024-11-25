package com.example.demo.form;

import lombok.Data;

/**
 * ボード情報 フォーム
 * 
 * @author yajimaseiryu
 */
@Data
public class CreateBoardForm {
	
	/* 主キー*/
	private String boardId;
	
	/** 作成ユーザー名*/
	private String userName;
	
	/** 攻守*/
	private String boardType;
	
	/** タイトル*/
	private String title;
	
	/** 公開の有無*/
	private String ispublic;
	
	/** いいねの数*/
	private String goods;
	
	/** ボードの詳細データ*/
	private String boards;

}
