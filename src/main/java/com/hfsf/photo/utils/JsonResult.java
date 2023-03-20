package com.hfsf.photo.utils;

import java.io.Serializable;

public class JsonResult implements Serializable{
	
	private static final long serialVersionUID = -8089635733597073476L;
	
	protected String code = "000000";
	
	public JsonResult() {
		
	}
	
	public JsonResult(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
	

}
