public class QNumber6{
	public static void main(String[] args){
		int[] intArr = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };
		int revArr[] = new int[intArr.length];
		int i,j=intArr.length-1;
		for(i=0; i<intArr.length ; i++){
			revArr[j--]=intArr[i];
		}
		System.out.print("\nReversed array : ");
		for(i=0;i<revArr.length;i++){
			System.out.print(revArr[i]+"\t");
		}
	}
}