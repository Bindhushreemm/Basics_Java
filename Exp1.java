import java.util.*;
public class Exp1 {
	
	public static void arrotate(int arr[],int n,int rotateby) {
		int position=1;
		while(position<=rotateby) {
			int lastelm=arr[0];
			for(int i=0;i<n;i++) {
				arr[i]=arr[i+1];
			}
			arr[n]=lastelm;
			position++;
		}
		for(int i=0;i<=n;i++) {
			System.out.printf(arr[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int arr[] = new int[20];
		System.out.println("enter the array elements");
		for(int i=0;i<=n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the time u want the array to be rotated");
		int rotateby=sc.nextInt();
		//int arr[]= {1,2,3,4};
		//int n=arr.length;
		//int rotateby=3;
		arrotate(arr,n,rotateby);
	}

}
