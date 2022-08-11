import java.util.Scanner;
public class oddeven
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		/*boolean isEven=true;
		for(int i=1; i<=n; i++)
		{
			isEven=!isEven;
		}
		if(isEven)
			System.out.println("Even");
		else
			System.out.println("Odd");*/
		
		if(!(n&1))
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}
