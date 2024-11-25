package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BoardInfo;
import com.example.demo.form.CreateBoardForm;
import com.example.demo.repository.BoardInfoRepository;
import com.example.demo.service.BoardService;

import lombok.RequiredArgsConstructor;

/**
 * ボード情報管理 コントローラ
 * 
 * @author yajimaseiryu
 */
@RestController
@RequiredArgsConstructor
public class BoardController {
	
	/** ボード管理 service*/
	private final BoardService service;
	
	/*ボード情報テーブル DAO**/
	private final BoardInfoRepository repository;
	
	
	/**
	 * 
	 * @param form 作成するボードの情報
	 */
	@PostMapping("/api/board/create")
	public void createBoard(@RequestBody CreateBoardForm form) {
		service.resistBoardInfo(form);
		return;
		
	}
	
	/**
	 * 
	 * @return DBのすべてのボード情報
	 */
	@GetMapping("/api/board/get")
	public List<BoardInfo> getBoards() {
		var boardInfo = repository.findAll();		
			return boardInfo;
	}
	
	/**
	 * 
	 * @param boardId 取得したボードのId
	 * @return Idから取得したボードの情報(1件)
	 */
	@GetMapping("/api/board/find-by-boardid")
	public BoardInfo getFindedBoard(@RequestParam String boardId ) {
		var boardInfo = service.findByBoardId(boardId);
		return boardInfo;
	}
	
	/**
	 * 
	 * @param username 絞り込みに使いたいユーザー名
	 * @return	ユーザー名で絞り込んだボード情報
	 */
	@GetMapping("/api/board/filter-by-username")
	public List<BoardInfo> getFilteredBoards(@RequestParam String username) {
		var boardInfo = service.filterByUsername(username);
		return boardInfo;
	}
	
	/**
	 * 
	 * @param boardId 削除したいボードのId
	 */
	@PostMapping("/api/board/delete")
	public void deleteBoard(@RequestParam String boardId) {
		service.deleteBoardById(boardId);
		return ;
	}

}
