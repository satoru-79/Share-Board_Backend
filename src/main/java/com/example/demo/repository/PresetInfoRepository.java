package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.PresetInfo;

/**
 * プリセット情報 Repository
 * 
 * @author yajimaseiryu
 */
@Repository
public interface PresetInfoRepository extends JpaRepository<PresetInfo, String>{

	/**
	 * 
	 * @param username 絞り込みたいユーザーのユーザー名
	 * @return 絞り込み結果リスト
	 */
	List<PresetInfo> findByUsername(String username);
}
