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
		for(int i=2; i<inputNumber ;i++){
			if(primeChecker(i)){
				listOfPrimes.add(i);
			}
		}
		return listOfPrimes;
	}
	
	public static boolean primeChecker(int number){
		 if ((number%2==0) &&number>2){
			 return false;
		 }
		    for(int i=3;i*i<=number;i+=2) {
		        if(number%i==0){
		        	return false;
		        }
		    }
		    return true;
	}
}
