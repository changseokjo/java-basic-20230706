package com.jochangseok.board.entity;

//좋아요한 사용자의 프로필 사진 / [좋아요한 사용자의 이메일] / 좋아요한 사용자의 닉네임

public class Liky {
	private String userProfileImage;
	private String userEmail;
	private String userNickname;
	
	public Liky(String userProfileImage, String userEmail, String userNickname) {
		this.userProfileImage = userProfileImage;
		this.userEmail = userEmail;
		this.userNickname = userNickname;
	}

	public String getUserProfileImage() {
		return userProfileImage;
	}

	public void setUserProfileImage(String userProfileImage) {
		this.userProfileImage = userProfileImage;
	}

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	public String getUserEmail() {
		return userEmail;
	}
	
	
	
}
