package com.cos.mongoapp.web.dto;

import com.cos.mongoapp.domain.Board;

public class BoardSaveReqDto {
	private String title;
	private String content;
	
	public Board toEntity() {
		Board board = new Board();
		board.setTitle(title);
		board.setContendt(content);
		return board;
	}
}
