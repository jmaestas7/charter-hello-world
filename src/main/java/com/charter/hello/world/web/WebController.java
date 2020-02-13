package com.charter.hello.world.web;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.charter.hello.world.model.HelloWorldResponse;

@RestController
public class WebController {

	HelloWorldResponse response = new HelloWorldResponse();

	// POST mapping, routed to "/hello"
	@RequestMapping(value = "/hello", 
			method = RequestMethod.POST,
			consumes = { "application/json" }, 
			produces = { "application/json"})
	// create post method that accepts the json payload, since the class
	// construction of the response already matches the json payload we can
	// just set the istantiated response equal to the request
	public void postMethod(
			@RequestBody HelloWorldResponse request) {
		response = request;
	}

	// GET mapping,S routed to "/hello"
	@RequestMapping(value = "/hello", 
			method = RequestMethod.GET, 
            consumes = {"application/json"}, 
			produces = { "application/json"})
	// ResponseBody mapping, simply return the response which is the
	// HelloWorldResponse we already istantiated and made equal to the
	// in the postMethod
	@ResponseBody
	public HelloWorldResponse getMethod() {
		return response;
	}
}
