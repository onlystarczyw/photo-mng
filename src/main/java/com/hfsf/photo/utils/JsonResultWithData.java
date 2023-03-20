package com.hfsf.photo.utils;

import java.io.Serializable;

public class JsonResultWithData<T> extends JsonResult implements Serializable{
	
	private static final long serialVersionUID = 3226527621378387181L;
	
	private T data;
	
	public JsonResultWithData(String code, T data) {
		this.code = code;
		this.data = data;
	}
	
	public JsonResultWithData(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}
