package testing2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBinaryTest {

	@Test 
	public void testToString(){
		check(0,"0");
		check(2,"10");
	}
	private void check(int i, String s){
		MyBinaryNumber n = new MyBinaryNumber(i);
		String s2 = n.toString();
		assertTrue(s.equals(s2));
	}

}
