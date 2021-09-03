public class QNumber1{
	public static void main(String[] args){
		int arry[] = {23,6,47,35,2,14}; 
		//double ave,sum=0.0;
		int sum=0;
		double ave;
		for(int i=0 ; i<arry.length;i++){		
			sum += arry[i];
		}
		//ave=sum/arry.length;
		ave=(double)sum/arry.length;
		System.out.print("\nAverage = "+ave+"\n");
	}
}