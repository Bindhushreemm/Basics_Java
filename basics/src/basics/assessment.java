import java.util.Scanner;

public class assessment {
	int marks;
	String name;
	Scanner sc=new Scanner(System.in);
	public void display() {
		System.out.println("enter the marks");
		marks=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the name");
		name=sc.nextLine();
	}
	public void marks() {
		if(marks>90 && marks<=100) {
			System.out.println(name+":"+"distinction");
			
		}
		else if (marks>80 && marks<=90) {
			System.out.println(name+":"+"first class");
		}
			
		else if(marks>70 && marks<=80) {
				System.out.println(name+":"+"first class");
			
		}
		else if(marks>35 && marks<=70) {
			System.out.println(name+":"+"second classs");
		}
		else {
			System.out.println(name+":"+"fail");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		assessment obj1=new assessment();
		obj1.display();
		obj1.marks();
		
	
		
	}

}
