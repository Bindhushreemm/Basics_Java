import java.util.*;

public class Conditional {
	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		age=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the name");
		String name=sc.nextLine();
		
		if(age>=18 && age<=50) {
			System.out.println(name+":"+"eligible");
			
		}
		else {
			System.out.println(name+":"+"not eligible");
		}

		
	}
	
}
