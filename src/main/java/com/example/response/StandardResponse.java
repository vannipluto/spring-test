/**
 * 
 */
package com.example.response;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Risposta di test per un servizio web
 * 
 * @author francesco.monaca
 *
 */
@JsonSerialize
public class StandardResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -692012742190776830L;

	private String responseOne;
	private String responseTwo;
	private String responseThree;
	private String error;
	
	
	public String getResponseOne() {
		return responseOne;
	}
	public void setResponseOne(String responseOne) {
		this.responseOne = responseOne;
	}
	public String getResponseTwo() {
		return responseTwo;
	}
	public void setResponseTwo(String responseTwo) {
		this.responseTwo = responseTwo;
	}
	public String getResponseThree() {
		return responseThree;
	}
	public void setResponseThree(String responseThree) {
		this.responseThree = responseThree;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	
	
	
}
