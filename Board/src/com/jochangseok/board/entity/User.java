package com.jochangseok.board.entity;

import com.jochangseok.board.dto.request.SignUpRequestDto;

//이메일 / 비밀번호 / 닉네임 / 휴대폰번호 / 주소 / 상세주소 / 개인정보동의 여부 / 프로필 사진

public class User {
	
	private String email;
	private String password;
	private String nickname;
	private String telNumber;
	private String address;
	private String addressDetail;
	private boolean agreedPersonal;
	private String profileImage;
	
	public User(String email, String password, String nickname, String telNumber, String address, String addressDetail,
			boolean agreedPersonal) {
		this.email = email;
		this.password = password;
		this.nickname = nickname;
		this.telNumber = telNumber;
		this.address = address;
		this.addressDetail = addressDetail;
		this.agreedPersonal = agreedPersonal;
	}
	
	public User (SignUpRequestDto dto) {
		this.email = dto.getEmail();
		this.password = dto.getPassword();
		this.nickname = dto.getNickname();
		this.telNumber = dto.getTelNumber();
		this.address = dto.getAddress();
		this.addressDetail = dto.getAddressDetail();
		this.agreedPersonal = dto.isAgreedPersonal();
		this.profileImage = null;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public String getAddress() {
		return address;
	}

	public String getAddressDetail() {
		return addressDetail;
	}

	public boolean isAgreedPersonal() {
		return agreedPersonal;
	}
	
	public boolean isCreateValid() {
		if (email == null || password == null || 
				nickname == null || telNumber == null || address == null) {
			return false;
		}
		
		if (email.isBlank() || password.isBlank() ||
				nickname.isBlank() || telNumber.isBlank() ||
				address.isBlank() || !agreedPersonal) {
			return false;
		}
		
		return true;
	}

}
