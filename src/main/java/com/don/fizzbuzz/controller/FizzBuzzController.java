package com.don.fizzbuzz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.don.fizzbuzz.service.FizzBuzzService;

@RestController
public class FizzBuzzController {
	
	@Autowired
	private FizzBuzzService fizzBuzzService;

	// Calling using: http://localhost:8080/fizzbuzz?input=1,2,3,4,5,6,7,8,9,10
	@RequestMapping(value = "/fizzbuzz", params = "input", method = RequestMethod.GET)
	public ResponseEntity<List<String>> fizzBuzz(@RequestParam("input") int[] input) {
		return new ResponseEntity<>(fizzBuzzService.getFizzBuzz(input), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<String> home() {
		return new ResponseEntity<>("Server is Up and Running!", HttpStatus.OK);
	}

}
