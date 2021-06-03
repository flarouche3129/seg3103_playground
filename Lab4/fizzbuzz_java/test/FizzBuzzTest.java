import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

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

    
}
