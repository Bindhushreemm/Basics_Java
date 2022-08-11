package p2;
import p1.*;
import java.util.*;
public class news1 {
public static void main(String[] args) {
	ValidateData std=new ValidateData();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the id");
	std.id=sc.nextInt();
	
	ValidateData obj1=new ValidateData() ;
     obj1.stddetails();
}
}
