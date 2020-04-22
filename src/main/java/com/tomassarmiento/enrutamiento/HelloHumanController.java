package com.tomassarmiento.enrutamiento;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {
	@RequestMapping("")
    public String home(@RequestParam(value="nombre", required=false) String nombre, @RequestParam(value="apellido", required=false) String apellido) {
		if(nombre==null) {
			return "¡Hola Humano!"+"¡Bienvenido a SpringBoot!";
		}
		else if(apellido!=null && nombre!=null){
			return "¡Hola "+nombre+" "+apellido+"! ¡Bienvenido a SpringBoot!";
		}
		else if(nombre!=null && apellido==null){
			return "¡Hola "+nombre+"! ¡Bienvenido a SpringBoot!";
		}
		else {
			return "¡Hola Humano!"+"¡Bienvenido a SpringBoot!";
		}
	}
}
