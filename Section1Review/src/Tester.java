import static org.junit.Assert.*;

import org.junit.*;

public class Tester {

	private LoopFun obj;
	
	@Before
	public void setUp(){
		obj = new LoopFun();
	}
	
	@Test
	public void testPermutationCount(){
		assertEquals(obj.getPermutationCount(8), 40320);
		assertEquals(obj.getPermutationCount(0), 0);
		assertEquals(obj.getPermutationCount(-1), 0);
		assertEquals(obj.getPermutationCount(10), 3628800);
		assertEquals(obj.getPermutationCount(1), 1);
	}
	
	
	
	
}
