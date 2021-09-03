public class QNumber7{
	public static void main(String[] args){
		int[] arry = {1,2,5,5,6,6,7,2};
		System.out.println("\nDuplicate values : ");
		for(int i=0 ; i<arry.length ; i++){
			for(int j=i+1 ; j<arry.length ; j++){
				if(arry[i] == arry[j]){
					System.out.println(arry[i]);
					break;
				}
			}
		}
	}
}