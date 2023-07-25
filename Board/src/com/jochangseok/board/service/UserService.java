package com.jochangseok.board.service;

import java.util.Map;

import com.jochangseok.board.dto.request.SignUpRequestDto;
import com.jochangseok.board.dto.response.SignUpResponseDto;

public interface UserService {
	SignUpResponseDto signUp(SignUpRequestDto dto);
}
