package com.cms.entities;

public class Status {

	private int id;
	private int code;
	private String message;
	private Object object;
			
	
	public Status(int id, int code, String message, Object object) {
		super();
		this.id = id;
		this.code= code;
		this.message = message;
		this.object = object;
	}
	

	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public Object getObject() {
		return object;
	}


	public void setObject(Object object) {
		this.object = object;
	}


	@Override
	public String toString() {
		return "Status [id=" + id + ", code=" + code + ", message=" + message + ", object=" + object + "]";
	}
}
