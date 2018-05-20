package pl.piomin.services.secure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecureController {

	@GetMapping("/hello")
	public String secureHello() {
		return "I'm secured!";
	}
	
}
