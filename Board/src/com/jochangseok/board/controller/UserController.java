package com.jochangseok.board.controller;

import com.jochangseok.board.dto.request.SignUpRequestDto;
import com.jochangseok.board.dto.response.SignUpResponseDto;

public interface UserController {
	
	SignUpResponseDto signUp(SignUpRequestDto requestDto);
	
	

}
