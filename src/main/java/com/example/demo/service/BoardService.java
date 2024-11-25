package com.example.demo.service;

import java.util.List;

import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BoardInfo;
import com.example.demo.form.CreateBoardForm;
import com.example.demo.repository.BoardInfoRepository;

import lombok.RequiredArgsConstructor;

/**
 * ボード情報管理 Service
 * 
 * @author yajimaseiryu
 * 
 */
@Service
@RequiredArgsConstructor
public class BoardService {
	
	/*ボード情報テーブル DAO**/
	private final BoardInfoRepository repository;
	
	/** Dozer Mapper */
	private final Mapper mapper;
	
//	/** PasswordEncoder*/
//	private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	/**
	 * ボード情報テーブル 新規登録
	 * 
	 * @param form 作成するボードの情報
	 * @return 
	 */
	public void resistBoardInfo(CreateBoardForm form) {
		var boardInfo = mapper.map(form, BoardInfo.class);
		repository.save(boardInfo);
		return;
	}
	
	/**
	 * 指定したidのボードをDBから削除
	 * 
	 * @param boardId 削除するボードのid
	 */
	public void deleteBoardById(String boardId) {
		repository.deleteById(boardId);
	}
	
	/**
	 * 指定したユーザー名のボードをDBから取得
	 * 
	 * @param boardId 取得するボードのユーザー名
	 */
	public List<BoardInfo> filterByUsername(String username) {
		return repository.findByUserName(username);
	}
	
	/**
	 * 
	 * @param boardId 検索したいボードのid
	 * @return　検索結果(1件)
	 */
	public BoardInfo findByBoardId(String boardId) {
		return repository.findByBoardId(boardId);
	}
	
	
	
	
	
	
}
