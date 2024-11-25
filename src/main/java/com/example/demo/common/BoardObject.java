package com.example.demo.common;

import java.util.List;

import jakarta.persistence.Embeddable;

import lombok.Data;

/**
 * ボード情報を構成するクラス
 * 
 * @author yajimaseiryu
 */
@Data
@Embeddable
public class BoardObject {
	
	/** ホーム側のプレイヤーのリスト*/
	private List<Player> homePlayers;
	
	/** アウェイ側のプレイヤーのリスト*/
	private List<Player> awayPlayers;
	
	/** 矢印のリスト*/
	private List<ArrowObject> arrows;
	
	/** コートの種類*/
	private Number court;
	
	/** ボールの位置*/
	private Position ballPosition;
	
	/** コメント*/
	private String comment;
}
