package com.charter.hello.world.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HelloWorldResponse {
    String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	// had to add empty constructor method otherwise pointing to a null or empty
	// constructor that was istantiated with the message field would not point
	// to the same location and therefore could not be overwritten
	public HelloWorldResponse() {
	}

	public HelloWorldResponse(String message) {
		this.message = message;
    }

}
