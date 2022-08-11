package p4;
import java.util.*;
import java.util.Scanner;


import ass1.Emp;

public class emp1 {
	
	
	 
	 public static void main(String[] args) {
		Emp obj=new Emp();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the employee number");
		obj.empno=sc.nextInt();
		System.out.println("enter the employee name");
		obj.ename=sc.next();
		System.out.println("enter the employee department");
		obj.edept=sc.next();
		System.out.println("enter the employee salary");
		obj.salary=sc.nextDouble();
		System.out.println("enter the employee service");
		obj.service=sc.nextInt();
		emp2 obj2=new emp2(obj.salary,obj.service);
		emp2 obj3=new emp2(obj.empno);
		//obj2.display(obj.salary,obj.service);
		System.out.println("employee number :"+obj.empno+"\n"+"employee name:"+obj.ename+"\n"+"employee department:"+obj.edept+"\n"+"employee salary:"+obj.salary);
		
	}

}
