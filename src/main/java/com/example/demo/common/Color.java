package com.example.demo.common;

import jakarta.persistence.Embeddable;

/**
 * 駒の色情報を構成するクラス
 * 
 * @author yajimaseiryu
 */
@Embeddable
public class Color {
	
	/** カラーコード*/
	private String code;
	
	/** 背番号を黒にするか*/
	private Boolean isblack;
}
