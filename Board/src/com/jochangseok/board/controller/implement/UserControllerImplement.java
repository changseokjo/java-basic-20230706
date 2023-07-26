package com.jochangseok.board.controller.implement;

import com.jochangseok.board.controller.UserController;
import com.jochangseok.board.dto.request.SignInRequestDto;
import com.jochangseok.board.dto.request.SignUpRequestDto;
import com.jochangseok.board.dto.response.ResponseEntity;
import com.jochangseok.board.dto.response.SignInResponseDto;
import com.jochangseok.board.dto.response.SignUpResponseDto;
import com.jochangseok.board.service.UserService;

public class UserControllerImplement implements UserController {
	
	private final UserService userService;
	
	public UserControllerImplement(UserService userService) {
		this.userService = userService;
	}

	@Override
	public ResponseEntity<SignUpResponseDto> signUp(SignUpRequestDto requestDto) {
		boolean isValid = requestDto.valid();
		if (!isValid) return ResponseEntity.badRequest();
		
		ResponseEntity<SignUpResponseDto> result = userService.signUp(requestDto);
		return result;
	}

	@Override
	public ResponseEntity<SignInResponseDto> signIn(SignInRequestDto requestDto) {
		boolean isValid = requestDto.valid();
		if (!isValid) return ResponseEntity.badRequest();
		
		ResponseEntity<SignInResponseDto> result = userService.signIn(requestDto);
		return result;
	}

}
