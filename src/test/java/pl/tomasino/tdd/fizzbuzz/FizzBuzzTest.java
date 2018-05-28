package pl.tomasino.tdd.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	
	FizzBuzz fb;
	
	@Before
	public void setUp(){
		fb = new FizzBuzz();
	}
	
	@Test
	public void shouldBe1WhenInput1(){		
		Assertions.assertThat(fb.convert(1)).isEqualTo("1");
	}
	
	@Test
	public void shouldBe2WhenInput2(){		
		Assertions.assertThat(fb.convert(2)).isEqualTo("2");
	}
	
	@Test
	public void shouldBeFizzWhenInput3(){		
		Assertions.assertThat(fb.convert(3)).isEqualTo("Fizz");
	}
	
	
	@Test
	public void shouldBeBuzzWhenInput5(){		
		Assertions.assertThat(fb.convert(5)).isEqualTo("Buzz");
	}
	
	
	@Test
	public void shouldBeFizzWhenInput6(){		
		Assertions.assertThat(fb.convert(6)).isEqualTo("Fizz");
	}
	
	@Test
	public void shouldBeBuzzWhenInput10(){		
		Assertions.assertThat(fb.convert(10)).isEqualTo("Buzz");
	}
	
	@Test
	public void shouldBeBuzzWhenInput150(){		
		Assertions.assertThat(fb.convert(150)).isEqualTo("FizzBuzz");
	}
	
	
	@Test
	public void shouldBeFizzBuzzWhenInput15(){		
		Assertions.assertThat(fb.convert(15)).isEqualTo("FizzBuzz");
	}
	
	
	@Test (expected = InvalidNumberException.class)
	public void shouldThrowExceptionWhenInput0(){		
		fb.convert(0);
	}
	
	@Test
	public void shouldPrint1To15When15(){		
		Assertions.assertThat(fb.printResult(15)).isEqualTo("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz");
	}
	
}