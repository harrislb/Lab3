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

	public static ArrayList generatePrime(int inputNumber) {
		ArrayList<Integer> listOfPrimes = new ArrayList();
		ArrayList<Integer> listOfSmallerPrimes = new ArrayList();
			listOfPrimes.add(2); 
			listOfPrimes.add(3);
			for(int i =0; listOfPrimes.get(i)<inputNumber;i++){
				System.out.println(listOfPrimes.get(i));
				listOfSmallerPrimes.add(listOfPrimes.get(i));
			}
			return listOfSmallerPrimes;
	}
}
