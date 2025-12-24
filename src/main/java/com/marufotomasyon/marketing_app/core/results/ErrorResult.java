package com.marufotomasyon.marketing_app.core.results;

public class ErrorResult extends Result{
	public ErrorResult() {
		super(false);
	} 
	
	public ErrorResult(String message) {
		super(false,message);
	} 
}