package com.don.fizzbuzz;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.don.fizzbuzz.util.FizzBuzzUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FizzbuzzApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void fizzBuzzTest() {
		FizzBuzzUtil fizzBuzz = new FizzBuzzUtil();
		
		int [] input = {1,2,3,4,5,6,7,8,9,100,15};
		
		List<String> results = fizzBuzz.getFizzBuzz(input);
		
		assertEquals(FizzBuzzUtil.FIZZ, results.get(2));
		assertEquals(FizzBuzzUtil.BUZZ, results.get(4));
		assertEquals(FizzBuzzUtil.FIZZ, results.get(8));
		assertEquals(FizzBuzzUtil.BUZZ, results.get(9));
		assertEquals(FizzBuzzUtil.FIZZ_BUZZ, results.get(10));
		assertEquals("2", results.get(1));
		assertEquals("7", results.get(6));
	}

}
