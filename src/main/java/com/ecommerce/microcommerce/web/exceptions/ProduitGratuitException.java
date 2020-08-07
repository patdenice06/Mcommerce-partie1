package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProduitGratuitException extends Exception {
	private static final long serialVersionUID = -3199657628382622030L;

	public ProduitGratuitException(String message) {
		super(message);
	}

}
