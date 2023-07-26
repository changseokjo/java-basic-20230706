package com.jochangseok.board.controller;

import com.jochangseok.board.dto.request.SignInRequestDto;
import com.jochangseok.board.dto.request.SignUpRequestDto;
import com.jochangseok.board.dto.response.ResponseEntity;
import com.jochangseok.board.dto.response.SignInResponseDto;
import com.jochangseok.board.dto.response.SignUpResponseDto;

public interface UserController {
	
	ResponseEntity<SignUpResponseDto> signUp(SignUpRequestDto requestDto);
	ResponseEntity<SignInResponseDto> signIn(SignInRequestDto requestDto);

}

// ResponseDto :       int status, String message
// SignInResponseDto : int status, String meeeage, String email, String nickname, String p...