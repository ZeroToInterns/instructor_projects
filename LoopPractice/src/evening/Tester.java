package evening;

import static org.junit.Assert.*;

import org.junit.*;

public class Tester {

	StringLoop obj;
	
	@Before
	public void setUp(){
		obj = new StringLoop();
	}
	
	@Test
	public void testStringLoopPrintEven(){
		assertEquals(obj.printEvens(), 2);
	}
	
	@Test
	public void testStringLoopPrintOdd(){
		assertEquals(obj.printOdds(), 1);
	}
}
