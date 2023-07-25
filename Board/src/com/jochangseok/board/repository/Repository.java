package com.jochangseok.board.repository;

public interface Repository<E, K> {

	// 데이터 생성 (저장) : CREATE
	boolean create(E entity);
	
	// 데이터 읽기 (검색) : READ
	E read(K key);
	
	// 데이터 수정 (수정) : UPDATE
	boolean update(E entity);
	
	// 데이터 삭제 (삭제) : DELETE
	boolean delete(K key);
	
}
