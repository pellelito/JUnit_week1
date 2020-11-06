package mattari;

import static org.junit.Assert.assertEquals;
	
import org.junit.Test;

public class TestClassTest {
	
	static TestClass test = new TestClass();
	
	// 1
	@Test
	public void testLong() {
		long one = 120;
		long two = 80;
		
		assertEquals(200,one+two);
	}
	// 2
	@Test
	public void testFloat() {
		float one = 0.0014f;
		float two = 0.0012f;
//		float one = 0.0013f;  //Varför failar denna?
//		float two = 0.0011f;
		float delta = 0.0002f;
		assertEquals(one, two, delta);
	}
	// 3
	@Test
	public void testInt() {
		int one = 120;
		int two = 80;
		
		assertEquals(200,one+two);
	}
	// 4
	@Test
	public void testDouble() {
		double one = 120.5;
		double two = 80;
		double delta = 0.5;
		
		assertEquals(200,one+two, delta);
	}
	// 5
	@Test
	public void testIntAgain() {

		assertEquals(23,test.returnMaxInt(23, 11));
		
	}
	// 6
	@Test
	public void testDoubleAgain() {
		double delta = 0.5;
		assertEquals(23.5,test.returnMaxDouble(23.5, 11.34), delta);
			
	}
	// 7	
	@Test		
	public void testIntAThirdTime() {

		assertEquals(23,test.returnMaxInt(23, 11));
			
	}
	// 8
	@Test
	public void testLongAgain() {
		
		assertEquals(120, test.returnMaxLong(120,80));
	}
	// 9
	@Test
	public void testExponent() {
		
		assertEquals(36, test.returnExponent(6,2),0);
	}
	// 10
	@Test
	public void testIntPlusOne() {
			
		assertEquals(-2147483646, test.returnIntPlusOne(-2147483647));
	}
	// 11
	@Test
	public void testLongPlusOne() {
					
		assertEquals(9223372036854775807L, test.returnLongPlusOne(9223372036854775806L));
	}	
	// 12
	@Test
	public void testIntMinusOne() {
					
		assertEquals(-2147483648, test.returnIntMinusOne(-2147483647));
	}	
	//13
	@Test
	public void testLongMinusOne() {
					
		assertEquals(9223372036854775806L, test.returnLongMinusOne(9223372036854775807L));
	}
	// 14
	@Test
	public void testRootSquare() {
		double one = 16;	
		assertEquals(4, test.returnRootSquare(one),0);
	}
	// 15
	@Test
	public void testRootCube() {
		double one = 27;	
		assertEquals(3, test.returnRootCube(one),0);
	}
	@Test
	public void testRandom() {
		
		assertEquals(0.3618031071604718, test.returnRandom(),0);
		
		//System.out.println(test.returnRandom(System.currentTimeMillis()));
		
	}
}
