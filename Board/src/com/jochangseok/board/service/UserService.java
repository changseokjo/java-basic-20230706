package com.jochangseok.board.service;

import java.util.Map;

import com.jochangseok.board.dto.request.SignInRequestDto;
import com.jochangseok.board.dto.request.SignUpRequestDto;
import com.jochangseok.board.dto.response.ResponseEntity;
import com.jochangseok.board.dto.response.SignInResponseDto;
import com.jochangseok.board.dto.response.SignUpResponseDto;

public interface UserService {
	ResponseEntity<SignUpResponseDto> signUp(SignUpRequestDto dto);
	ResponseEntity<SignInResponseDto> signIn(SignInRequestDto dto);
}
