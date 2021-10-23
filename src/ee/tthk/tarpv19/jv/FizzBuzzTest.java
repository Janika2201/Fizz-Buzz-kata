package ee.tthk.tarpv19.jv;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void sholdReturn100() {
		FizzBuzz fz = new FizzBuzz();
		assertEquals(100, fz.getNumbers().length);
	}
	@Test
	public void mupltiplesOfThree() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("fizz", fb.fizzbuzz(3));
	}
	@Test
	public void mupltiplesOfFive() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("buzz", fb.fizzbuzz(5));
	}
	@Test
	public void mupltiplesOfFivteen() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("fizzbuzz", fb.fizzbuzz(15));
	}
	@Test
	public void zeroreturn(){
		FizzBuzz fb = new FizzBuzz();
		assertEquals("0", fb.fizzbuzz(0));
	}
	@Test
	public void ReturnbuzzforTen() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("buzz", fb.fizzbuzz(10));
	}
}
