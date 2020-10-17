package com.tesfai.springbootbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND )
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 2232696260717333909L;

	public ResourceNotFoundException(String message) {
		super(message);
	}
}
