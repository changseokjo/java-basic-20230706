package com.jochangseok.board.controller.implement;

import com.jochangseok.board.controller.UserController;
import com.jochangseok.board.dto.request.SignUpRequestDto;
import com.jochangseok.board.dto.response.SignUpResponseDto;
import com.jochangseok.board.service.UserService;

public class UserControllerImplement implements UserController {

	private final UserService userService;
	
	public UserControllerImplement(UserService userService) {
		this.userService = userService;
	}
	
	@Override
	public SignUpResponseDto signUp(SignUpRequestDto requestDto) {
		
		boolean isValid = requestDto.valid();
		if (!isValid) return new SignUpResponseDto(false, "올바르지 않은 입력입니다.");
		
		SignUpResponseDto result = userService.signUp(requestDto);
		
		return result;
	}

}
