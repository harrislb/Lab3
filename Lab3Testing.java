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
	
	@Test
	public void test3() {
		ArrayList t3 = new ArrayList();
		t3.add(3);
		assertEquals(t3, lab3.factor(3));
	}
	
	@Test
	public void test4() {
		ArrayList t4 = new ArrayList();
		t4.add(2);
		t4.add(2);
		assertEquals(t4, lab3.factor(4));
	}
	
	@Test
	public void test6(){
		ArrayList t6 = new ArrayList();
		t6.add(2);
		t6.add(3);
		assertEquals(t6, lab3.factor(6));
	}
	
	@Test
	public void test8(){
		ArrayList t8 = new ArrayList();
		t8.add(2);
		t8.add(2);
		t8.add(2);
		assertEquals(t8, lab3.factor(8));
	}

	@Test
	public void test9(){
		ArrayList t9 = new ArrayList();
		t9.add(3);
		t9.add(3);
		assertEquals(t9, lab3.factor(9));
	}
	
	@Test
	public void test325115(){
		ArrayList t325115 = new ArrayList();
		t325115.add(5);
		t325115.add(7);
		t325115.add(7);
		t325115.add(1327);
		assertEquals(t325115, lab3.factor(325115));
	}
	
	

}
