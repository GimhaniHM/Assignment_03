public class QNumber2{
	public static void main(String[] args){
		int arry[] = {-23,-6,-47,-35,-2,-14};
		int min=arry[0],max=arry[0];
		for(int i=0;i<arry.length;i++){
			if(arry[i]<min)
				min=arry[i];
			else if(arry[i]>max)
				max=arry[i];	
		}
		System.out.print("\nLowest value : "+min);
		System.out.print("\nHighest value : "+max+"\n");
	}
}