package p1;

import java.util.Scanner;


import p2.demo2;
import p3.demo1;
public class demo3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		demo2 obj=new demo2();
		System.out.println("enter the id");
		obj.id=sc.nextInt();
		System.out.println("enter the id");
		obj.name=sc.next();
		obj.display();
		//System.out.println(id+""+name);
		
		
		//obj.show();
		
	}

}
