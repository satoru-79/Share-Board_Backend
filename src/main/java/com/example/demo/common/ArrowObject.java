package com.example.demo.common;

import jakarta.persistence.Embeddable;

/**
 * 矢印の情報を構成するクラス
 * 
 * @author yajimaseiryu
 */
@Embeddable
public class ArrowObject {
	
	/** 主キー*/
	private String key;
	
	/** カラー*/
	private String color;
	
	/** 矢印の軌道*/
	private String path;
	
	/** 点線かどうか*/
	private Boolean dash;
	
	/** 始点の形*/
	private String startPlug;
	
	/** 終点の形*/
	private String endPlug;
	
	/** 視点と終点を入れ替えるか*/
	private Boolean reverse;
	
	/** 終点の文字*/
	private String endLabel;
	
	/** 始点の文字*/
	private String startLabel;
	
	/** 始点の座標*/
	private Position startPosition;
	
	/** 終点の座標*/
	private Position endPosition;

}
