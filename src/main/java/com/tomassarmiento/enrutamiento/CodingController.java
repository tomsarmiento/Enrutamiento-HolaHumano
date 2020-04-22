package com.tomassarmiento.enrutamiento;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {
	@RequestMapping("")
    public String home() {
		return "¡Hola coding dojo!";
	}
	
	@RequestMapping("/python")
    public String python() {
		return "Python fue increible!";
	}
	
	@RequestMapping("/java")
	public String java() {
		return "Java spring es mejor!";
	}
}
