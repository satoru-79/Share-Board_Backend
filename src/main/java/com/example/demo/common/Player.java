package com.example.demo.common;

import jakarta.persistence.Embeddable;

/**
 * 駒の情報を構成するクラス
 * 
 * @author yajimaseiryu
 */
@Embeddable
public class Player {
	
	
	/** 主キー*/
	private String key;
	
	/** 名前*/
	private String name;
	
	/** 背番号*/
	private Number number;
	
	/** ホームorアウェイ*/
	private String side;
	
	/** カラー*/
	private Color color;
	
	/** 駒の座標*/
	private Position position;
	
	
}
