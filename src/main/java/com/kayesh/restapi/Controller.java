package com.kayesh.restapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping("/get")
	public Response getResponse(){
		Response response = new Response();
		response.name = "kayesh";
		response.id = 1;
		return response;
	}
}
