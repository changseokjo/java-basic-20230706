package com.jochangseok.board.dto.response;

import com.jochangseok.board.common.ResponseMessage;

public class ResponseEntity<D> {
	private int status;
	private String message;
	private D data;
	
	public ResponseEntity(int status, String message, D data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}

	@Override
	public String toString() {
		return "[status=" + status + ", message=" + message + ", data=" + data + "]";
	}
	
	public static <D> ResponseEntity<D> ok() {
		return new ResponseEntity<D>(200, ResponseMessage.SUCCESS, null);
	}
	
	public static <D> ResponseEntity<D> ok(D data) {
		return new ResponseEntity<D>(200, ResponseMessage.SUCCESS, data);
	}
	
	public static <D> ResponseEntity<D> badRequest() {
		return new ResponseEntity<D>(400, ResponseMessage.NOT_VALID_VALUE, null);
	}
	
	public static <D> ResponseEntity<D> badRequest(String message) {
		return new ResponseEntity<D>(400, message, null);
	}
	
	public static <D> ResponseEntity<D> unauthorized() {
		return new ResponseEntity<D>(401, ResponseMessage.SIGN_IN_FAILED, null);
	}
	
	public static <D> ResponseEntity<D> internalServerError(String message) {
		return new ResponseEntity<D>(500, message, null);
	}
	
}