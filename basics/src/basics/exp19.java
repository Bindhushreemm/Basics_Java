import java.util.Scanner;

public class exp19 {
	public static void add(int x,int y) {
		int sum=x+y;
		System.out.println("sum is :"+sum);
		
	}
	public static void sub(int x,int y) {
		int sum=x-y;
		System.out.println("subtraction is :"+sum);
		
	}
	public static void mul(int x,int y) {
		int sum=x*y;
		System.out.println("multiplication is :"+sum);
		
	}
	public static void div(int x,int y) {
		try {
			int sum=x/y;
			System.out.println("division is :"+sum);

            
        }
        catch (ArithmeticException e) {
            
            System.out.println(
                "Divided by zero operation cannot possible");
        }
				
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value");
		int x=sc.nextInt();
		System.out.println("enter the value2");
		int y=sc.nextInt();
		System.out.println("enter the choice");
		int a=sc.nextInt();
		switch(a) {
		case 1:add(x,y);break;
		case 2:sub(x,y);break;
		case 3:mul(x,y);break;
		case 4:div(x,y);break;
		default:System.out.println("select one choice");
			
		
		}
	}

}
