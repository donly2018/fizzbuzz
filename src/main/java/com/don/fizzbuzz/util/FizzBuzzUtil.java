package com.don.fizzbuzz.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class FizzBuzzUtil {

	public static int FIZZ_NUM = 3;
	public static int BUZZ_NUM = 5;
	public static int FIZZ_BUZZ_NUM = FIZZ_NUM * BUZZ_NUM;
	
	public static String FIZZ = "fizz";
	public static String BUZZ = "buzz";
	public static String FIZZ_BUZZ = FIZZ+" "+BUZZ;

	public List<String> getFizzBuzz(int[] input) {
		List<String> retVal = new ArrayList();
		for (int num : input) {
			if(num % FIZZ_BUZZ_NUM == 0) {
				retVal.add(FIZZ_BUZZ);
			} else if (num % FIZZ_NUM == 0) {
				retVal.add(FIZZ);
			} else if (num % BUZZ_NUM == 0) {
				retVal.add(BUZZ);
			} else {
				retVal.add(String.valueOf(num));
			}
		}
		return retVal;
	}

}
