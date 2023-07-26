package com.jochangseok.board.common;

public interface ResponseMessage {

	String SUCCESS = "성공입니다.";
	String NOT_VALID_VALUE = "올바르지 않은 입력입니다.";
	String EXISTED_EMAIL = "이미 존재하는 이메일입니다.";
	String EXISTED_TEL_NUMBER = "이미 존재하는 전화번호입니다.";
	String EXISTED_NICKNAME = "이미 존재하는 닉네임입니다.";
	
	String SIGN_IN_FAILED = "로그인 정보가 일치하지 않습니다.";
	
	String DATABASE_ERROR = "데이터베이스 오류입니다.";
	
}
