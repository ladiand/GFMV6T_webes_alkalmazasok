package com.example.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	private SzamologepService szamologepService = new SzamologepService();
	
	@GetMapping("/")
	public String barmi() {
		return "Hello more!";
	}
	@GetMapping("/szamologep")
	public Double szamologep(
			@RequestParam("a") int a,
			@RequestParam("b") int b,
			@RequestParam("operator") String operator) {
		
		return szamologepService.szamol(a, b, operator);
	}
	
	@GetMapping(path = "/szamologep-rest", consumes = "applications/json", produces = "applications/json")
	public Double szamologepRest(@RequestBody CalculatorDto calculatorDto) {
		
		return szamologepService.szamol(
				calculatorDto.getA(),
				calculatorDto.getB(),
				calculatorDto.getCalculator()
				);
	}

}


