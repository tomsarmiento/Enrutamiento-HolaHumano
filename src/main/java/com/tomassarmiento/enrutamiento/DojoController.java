package com.tomassarmiento.enrutamiento;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{variable}")
    public String home(@PathVariable("variable") String variable){
		if(variable.equals("dojo")) {
			return "El Dojo es increíble!";
		}
		else if(variable.equals("burbank-dojo")) {
			return "¡El Dojo Burbank está localizado al sur de California!";
		}
		else if(variable.equals("san-jose")) {
			return "El Dojo SJ es el cuartel general";
		}
		else {
			return "¡Ups!";
		}
	}
	
}
