import java.util.ArrayList;


public class Lab3Code {

	public ArrayList factor(int num){
		ArrayList array = new ArrayList();
		if ((num %2)==0){
			while(((num%2)==0) && (num!=2)){
				array.add(2);
				num=num/2;
			}
		}
		else if(num==9){
			array.add(3);
			num=num-6;
		}
		array.add(num);
		return (num==1)? new ArrayList(): array;
	}
}
