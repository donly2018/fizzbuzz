package com.don.fizzbuzz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.don.fizzbuzz.util.FizzBuzzUtil;

@Service
public class FizzBuzzService {
	
	@Autowired
	private FizzBuzzUtil fizzBuzz;
	
	public List<String> getFizzBuzz(int [] input) {
		return fizzBuzz.getFizzBuzz(input);
	}

}
