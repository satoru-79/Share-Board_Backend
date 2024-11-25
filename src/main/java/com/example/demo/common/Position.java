package com.example.demo.common;

import jakarta.persistence.Embeddable;

import lombok.Data;

/**
 * 位置の情報を構成するクラス
 * 
 * @author yajimaseiryu
 */
@Embeddable
@Data
public class Position {
	
	/** x座標*/
	private float x;
	
	/** y座標*/
	private float y;
	
}
