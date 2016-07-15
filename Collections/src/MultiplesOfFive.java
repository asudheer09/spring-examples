


public class MultiplesOfFive {

	/**
	 * @param args

	 */
	
	public static void multipleof35(){
		int sum=0;
		for(int i=1;i<1000;i++){
			
			if(i%3==0 || i%5==0){
				sum=sum+i;
			}
		}
		
		System.out.println("mulitples of 3 and 5 are "+sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiplesOfFive.multipleof35();
	}

}
