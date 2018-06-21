package com.advance_jersey_app_3.app.jdbcConnection.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {

	private String errorMessage;
	private int errorCode;
	private String errorDocumantation;
		
	public ErrorMessage() {
	}
	
	public ErrorMessage(String errorMessage, int errorCode,
			String errorDocumantation) {
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
		this.errorDocumantation = errorDocumantation;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public int getErrorCode() {
		return errorCode;
	}
	
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
	public String getErrorDocumantation() {
		return errorDocumantation;
	}
	
	public void setErrorDocumantation(String errorDocumantation) {
		this.errorDocumantation = errorDocumantation;
	}
	
	
	
}
