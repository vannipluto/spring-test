package com.example.springboot;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.response.StandardResponse;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Ciao!";
	}

	@RequestMapping(value = "/testResponse", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public StandardResponse getTestResponse(
			@RequestParam(name = "paramOne", required = true)  String paramOne,
			@RequestParam(name = "paramTwo", required = false)  String paramTwo,
			@RequestParam(name = "paramThree", required = false)  String paramThree) {
		
		StandardResponse newResp = new StandardResponse();
		
		try {
			
			newResp.setResponseOne(paramOne);
			newResp.setResponseTwo(paramTwo != null ? paramTwo : "");
			newResp.setResponseThree(paramThree != null ? paramThree : "");
			newResp.setError("");
			
			
		} catch (Exception e) {
			newResp.setError("Exception " + e.getMessage());
		}
		
		return newResp;
		
	}
	
}
