import java.util.ArrayList;
import java.util.Random;


public class SumOfDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList <Integer> al=new ArrayList<Integer>();
		/*al.add(-113);
		al.add(-113);
		al.add(-113);
		al.add(-113);
		al.add(-113);
		al.add(-113);
		al.add(-113);
		al.add(-113);
		al.add(-113);
		al.add(-113);
		al.add(-113);
		System.out.println(al);
		
		for(int i=0;i<=10;i++){
			al.add(-113);
		}
		
		System.out.println(al);
		*/
		for(int i=0;i<=100;i++){
		
			int r= new Random().nextInt(100);
			
			al.add(r);
			
		}
		System.out.println(al);
	}

}
