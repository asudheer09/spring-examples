import java.util.Scanner;


public class AddMatrixes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m,n,c,d;
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("enter number of rows");
		
		m=s.nextInt();
		
		System.out.println("enter number of cols");
		
		n=s.nextInt();
		
		int first[][]=new int[m][n];
		int second[][]=new int[m][n];
		int sum[][]=new int[m][n];
		
		
		System.out.println("enter the number of elements in the first array ");
		
		for(c=0;c<m;c++){
			for(d=0;d<n;d++){
				first[c][d]=s.nextInt();
			}
		}
		
		System.out.println("enter the number of elements in the second array ");
		
		for(c=0;c<m;c++){
			for(d=0;d<n;d++){
				second[c][d]=s.nextInt();
			}
		}
		
		for(c=0;c<m;c++){
			for(d=0;d<n;d++){
				sum[c][d]=first[c][d]+second[c][d];
			}
		}
		
		System.out.println("sum of two matrices ======");
		
		for(c=0;c<m;c++){
			for(d=0;d<n;d++){
				 System.out.print(sum[c][d]+"\t");
			}
			 System.out.println();
		}
		
	}

}
