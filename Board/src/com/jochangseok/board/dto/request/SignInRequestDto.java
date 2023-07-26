package com.jochangseok.board.dto.request;

public class SignInRequestDto {

	private String email;
	private String password;
	
	public SignInRequestDto() {}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean valid() {
		if (email == null || password == null) return false;
		if (email.isBlank() || password.isBlank()) return false;
		return true;
	}
	
}
