package com.jochangseok.board.entity;

//검색어 / 이전 검색어 / 다음 검색어

public class SearchWord {

	private String word;
	private String preWord;
	private String nextWord;
	
	public SearchWord(String word, String preWord, String nextWord) {
		this.word = word;
		this.preWord = preWord;
		this.nextWord = nextWord;
	}

	public String getWord() {
		return word;
	}

	public String getPreWord() {
		return preWord;
	}

	public String getNextWord() {
		return nextWord;
	}
	
}
