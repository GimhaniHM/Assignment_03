import java.util.Scanner;
public class QNumber4{
	public static void main(String[] args){
		int[] arry = new int[10];
		int search,i;
		boolean found = false;
		Scanner s = new Scanner(System.in);
		System.out.println("\nEnter Integer values : ");
		for(i=0;i<arry.length;i++){
			System.out.printf("\tNumber %d : ",i+1);
			arry[i] = s.nextInt();
		}
		System.out.print("\nEnter searching value : ");
		search = s.nextInt();
		//i=0;
		/*while(i<arry.length){
			if(arry[i] == search){
				found=true;
				break;
			}
			i++;	
		}
		if(found)
			System.out.print(search+" is exit at "+i+" index");
		else
			System.out.print(search+" is not exit!");*/
		for(i=0;i<arry.length;i++){
			if(search == arry[i]){
				found=true;
				System.out.print(search+" is exit at "+i+" index");
			}
			else if((search == arry[i]) && (found == false))
				System.out.print(search+" is not exit!");
		}
	}
} 