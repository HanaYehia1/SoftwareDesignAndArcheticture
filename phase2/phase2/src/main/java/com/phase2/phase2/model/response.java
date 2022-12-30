package com.phase2.phase2.model;

public class response<T> {


	private boolean status;
	private String message;
	public T object;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
