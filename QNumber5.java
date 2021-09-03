public class QNumber5{
	public static void main(String[] args){
		int[] list = {23,45,12,56,22};
		int tmp,i;
		for(i=list.length;i>0;i--){
			for(int j=0 ; j<i-1 ; j++){
				if(list[j]>list[j+1]){
					tmp = list[j];
					list[j]=list[j+1];
					list[j+1]=tmp;
				}
			}
		}
		System.out.print("\nSorted list : ");
		for(i=0;i<list.length;i++){
			System.out.print(list[i]+"\t");
		}
	}
}