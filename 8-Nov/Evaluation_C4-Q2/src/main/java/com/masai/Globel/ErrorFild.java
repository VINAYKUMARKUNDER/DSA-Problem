package com.masai.Globel;

import java.time.LocalDateTime;

public class ErrorFild {
	
	private LocalDateTime timestamp;
	private String msg;
	private String desc;
	
	public ErrorFild() {
		// TODO Auto-generated constructor stub
	}

	public ErrorFild(LocalDateTime timestamp, String msg, String desc) {
		super();
		this.timestamp = timestamp;
		this.msg = msg;
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "ErrorFild [timestamp=" + timestamp + ", msg=" + msg + ", desc=" + desc + "]";
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public String getMsg() {
		return msg;
	}

	public String getDesc() {
		return desc;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	

}
