package com.health.exception;

import org.springframework.security.core.AuthenticationException;

public class PasswordErrorException extends AuthenticationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7844828399387786161L;

	/**
	 * 带参数构造
	 * @param message
	 */
	public PasswordErrorException(String message) {
		super(message);
	}

	public PasswordErrorException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
