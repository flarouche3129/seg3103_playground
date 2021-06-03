import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	private String fizzBuzz(int num){
		return "1";
	}

	@Test
	public void test_fizzBuzz1(){
		assertEquals("1", fizzBuzz(1));
	}

	@Test
	public void test_fizzBuzz2(){
		assertEquals("2", fizzBuzz(2));
	}

}
