import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import jdk.jfr.Timestamp;

public class FizzBuzzTest {


	//First version of FizzBuzz that only takes an integer and returns a single String.
	private String fizzBuzz(int num){
		if (num%3==0 && num%5==0){
			return "FizzBuzz";
		}else if (num % 3 == 0){
			return "Fizz";
		} else if (num % 5 == 0){
			return "Buzz";
		}
		return String.valueOf(num);
	}

	@Test
	public void test_fizzBuzz1(){
		assertEquals("1", fizzBuzz(1));
	}

	@Test
	public void test_fizzBuzz2(){
		assertEquals("2", fizzBuzz(2));
	}

	@Test
	public void test_fizzBuzz3(){
		assertEquals("Fizz", fizzBuzz(3));
	}

	@Test
	public void test_fizzBuzz5(){
		assertEquals("Buzz", fizzBuzz(5));
	}

	@Test
	public void test_fizzBuzz15(){
		assertEquals("FizzBuzz", fizzBuzz(15));
	}


	//Second version of FizzBuzz, which returns an array of Strings instead of a single string
	private String[] fizzBuzzArray(int num){

		String[] array = new String[num];

		for (int i = 1; i <= num; i++) {
			array[i-1] = String.valueOf(i);
		}
		return array;
	}


	@Test
	public void test_fizzbuzz_array_1(){
		String[] myArray = new String[1];
		myArray[0] = "1";

		assertArrayEquals(myArray, fizzBuzzArray(1));
	}

	@Test
	public void test_fizzbuzz_array_2(){
		String[] myArray = new String[]{"1", "2"};
		assertArrayEquals(myArray, fizzBuzzArray(2));
	}
	

    
}
