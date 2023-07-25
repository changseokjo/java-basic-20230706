package com.jochangseok.board.entity;

//댓글 작성자의 프로필 사진 / 댓글 작성자의 닉네임 / 댓글 작성 시간 / 댓글 내용

public class Comment {
	
	private String writerProfileImage;
	private String writerNickName;
	private String writeDatetime;
	private String contents;
	
	public Comment(String writerProfileImage, String writerNickName, String writeDatetime, String contents) {
		this.writerProfileImage = writerProfileImage;
		this.writerNickName = writerNickName;
		this.writeDatetime = writeDatetime;
		this.contents = contents;
	}

	public String getWriterProfileImage() {
		return writerProfileImage;
	}

	public void setWriterProfileImage(String writerProfileImage) {
		this.writerProfileImage = writerProfileImage;
	}

	public String getWriterNickName() {
		return writerNickName;
	}

	public void setWriterNickName(String writerNickName) {
		this.writerNickName = writerNickName;
	}

	public String getWriteDatetime() {
		return writeDatetime;
	}

	public String getContents() {
		return contents;
	}
	
	
	

}
