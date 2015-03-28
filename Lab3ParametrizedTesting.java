import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Lab3ParametrizedTesting {
	   private Integer inputNumber;
	   private ArrayList expectedResult;
	   
	   
	  @Before
	   public void initialize() {
	     Lab3Code lab3 = new Lab3Code();
	   }

	   public Lab3ParametrizedTesting(int inputNumber, 
	      ArrayList expectedResult) {
	      this.inputNumber = inputNumber;
	      this.expectedResult = expectedResult;
	   }
	
	@Parameterized.Parameters
		public static Collection primeNumber(){
		ArrayList test1 = new ArrayList();
		ArrayList test2 = new ArrayList();
		ArrayList test3 = new ArrayList();
		ArrayList test4 = new ArrayList();
		ArrayList test6 = new ArrayList();
		ArrayList test8 = new ArrayList();
		test3.add(2);
		test4.add(2);
		test4.add(3);
		test6.add(2);
		test6.add(3);
		test6.add(5);
		test8.add(2);
		test8.add(3);
		test8.add(5);
		test8.add(7);
		return Arrays.asList(new Object[][] {
				{1, test1},
				{2, test2},
				{3, test3},
				{4, test4},
				{6, test6},
				{8, test8}
				
		
		});
	}
	
	 @Test
	   public void testPrimeNumberGenerator() {
		 assertEquals(expectedResult, 
	      Lab3Code.generatePrime(inputNumber));
	   }
	
}
