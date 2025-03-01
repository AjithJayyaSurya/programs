import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.print("Enter the size of the Array:");
		int n=a.nextInt();
		int[] arr=new int[n];
		System.out.print("Enter the elements of the Array:");
		for(int i=0;i<n;i++){
		    arr[i]=a.nextInt();
		}
		int e=0;
		int o=0;
		for(int i=0;i<n;i++){
		    if(arr[i]%2==0)
		    e++;
		    else
		    o++;
		}
		int[] eve=new int[e];
		int[] odd=new int[o];
		int ev=0;
		int od=0;
		for(int j=0;j<n;j++){
		    if(arr[j]%2==0){
		        eve[ev++]=arr[j];
		    }
		    else{
		        odd[od++]=arr[j];
		    }
		}
		System.out.print(Arrays.toString(eve));
		System.out.print(Arrays.toString(odd));
	    
	}
}
