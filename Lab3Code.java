import java.util.ArrayList;


public class Lab3Code {

	public ArrayList factor(int num){
		ArrayList array = new ArrayList();
		 for (int i = 2; i <= num; i++) {
		      while (num % i == 0) {
		        array.add(i);
		        num=num/i;
		      }
		    }
		return array;
	}

	public static ArrayList generatePrime(Integer inputNumber) {
		ArrayList listOfPrimes = new ArrayList();
		listOfPrimes.add(2);
		return listOfPrimes;
	}
}
