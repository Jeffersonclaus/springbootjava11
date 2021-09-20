package com.clausweb.course.resources.exception;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StandardError implements Serializable{


	private static final long serialVersionUID = 1L;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT")
	private Instant timesstamp;
	private Integer status;
	private String error;
	private String mensage;
	private String path;

	public StandardError() {
		
	}

	public StandardError(Instant timesstamp, Integer status, String error, String mensage, String path) {
	
		this.timesstamp = timesstamp;
		this.status = status;
		this.error = error;
		this.mensage = mensage;
		this.path = path;
	}

	public Instant getTimesstamp() {
		return timesstamp;
	}

	public void setTimesstamp(Instant timesstamp) {
		this.timesstamp = timesstamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMensage() {
		return mensage;
	}

	public void setMensage(String mensage) {
		this.mensage = mensage;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
	
	
}
