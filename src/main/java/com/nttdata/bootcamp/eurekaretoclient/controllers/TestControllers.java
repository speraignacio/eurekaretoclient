package com.nttdata.bootcamp.eurekaretoclient.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllers {

	@GetMapping("/sumar/{num1}/{num2}")
	public Integer sumar(@PathVariable final Integer num1, @PathVariable final Integer num2) {
		return num1 + num2;
	}
	
	@GetMapping("/restar/{num1}/{num2}")
	public Integer resta(@PathVariable final Integer num1,@PathVariable final Integer num2) {
		return num1 - num2;
	}
	
}
