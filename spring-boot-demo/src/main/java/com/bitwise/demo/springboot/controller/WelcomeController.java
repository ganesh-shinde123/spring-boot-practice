/**
 * 
 */
package com.bitwise.demo.springboot.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ganeshs
 *
 */

@Controller	
public class WelcomeController {

	@Value("${application.message:Hello World}")
	private String message = "Hello World";

	@GetMapping("/")
	public String welcome(Map<String, Object> model) {
		System.out.println("*************Test");
		model.put("time", new Date());
		model.put("message", this.message);
		return "welcome";
	}

}
