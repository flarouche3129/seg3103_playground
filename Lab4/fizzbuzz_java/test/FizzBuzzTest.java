import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	private String fizzBuzz(int num){
		return "0";
	}

	@Test
	public void test_fizzBuzz1(){
		assertEquals("1", fizzBuzz(1));
	}

}
