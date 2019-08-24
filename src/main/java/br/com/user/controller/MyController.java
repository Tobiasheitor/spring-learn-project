package br.com.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping(path = "/me", method = RequestMethod.GET)
	public String olaMundo() {
		return "Ola Mundo";
	}
}
