package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BoardInfo;

/**
 * ボード情報 Repository
 * 
 * @author yajimaseiryu
 */
@Repository
public interface BoardInfoRepository extends JpaRepository<BoardInfo, String>{
	
	/**
	 * 
	 * @param username 絞り込みたいユーザーのユーザー名
	 * @return 絞り込んだ結果リスト
	 */
	List<BoardInfo> findByUserName(String username);
	
	/**
	 * 
	 * @param boardId 検索したいボードのId
	 * @return 検索結果(1件)
	 */
	BoardInfo findByBoardId(String boardId);
	
}
