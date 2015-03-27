import java.util.ArrayList;


public class Lab3Code {

	public ArrayList factor(int num){
		ArrayList array = new ArrayList();
		while(((num%2)==0) && (num!=2)){
			array.add(2);
			num=num/2;
		}
		array.add(num);
		return (num==1)? new ArrayList(): array;
	}
}
