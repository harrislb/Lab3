import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class Lab3Testing {
	Lab3Code lab3= new Lab3Code();

	@Test
	public void test1Empty() {
		
		assertEquals(new ArrayList(), lab3.factor(1));
	}
	
	@Test
	public void test2() {
		ArrayList t2 = new ArrayList();
		t2.add(2);
		assertEquals(t2, lab3.factor(2));
	}

}
