public class QNumber2{
	public static void main(String[] args){
		int array[] = {-23,-6,-47,-35,-2,-14};
		int min=array[0],max=array[0];
		for(int i=0;i<array.length;i++){
			if(array[i]<min)
				min=array[i];
			else if(array[i]>max)
				max=array[i];	
		}
		System.out.print("\nLowest value : "+min);
		System.out.print("\nHighest value : "+max+"\n");
	}
}