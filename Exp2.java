import java.util.Scanner;

public class Exp2 {
	public Exp2(int arr[],int n,int target) {
		for(int i=0;i<(n-1);i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println("the two number which add up to target are :"+arr[i]+","+arr[j]);
					//System.out.println("target is:"+target );
					System.out.println("indices of the two numbers such that they add up to target:"+i+","+j);
					
				}
				/*else {
					System.out.println("not found such cases");
				}*/
			}
		}
		
	}
	
	public static void main(String[] args) {
		//int n=5;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int arr[] = new int[20];
		System.out.println("enter the array elements");
		for(int i=0;i<=n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the target");
		int target=sc.nextInt();
		Exp2 obj=new Exp2(arr,n,target);
		
		
		
	}

}
