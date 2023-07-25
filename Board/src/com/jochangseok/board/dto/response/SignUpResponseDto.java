package com.jochangseok.board.dto.response;

public class SignUpResponseDto {

	private boolean status;
	private String message;
	
	public SignUpResponseDto(boolean status, String message) {
		this.status = status;
		this.message = message;
	}

	@Override
	public String toString() {
		return "SignUpResponseDto [status=" + status + ", message=" + message + "]";
	}


	
	
}
