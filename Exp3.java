import java.util.*;
public class Exp3 {
	public static void checkparenthesiss(String s) {
		int a=0,b=0,c=0;
		int check = 0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='(') {
				a++;
			}
			else if(ch==')') {
				a--;
			}
			else if(ch=='[') {
				b++;
			}
			else if(ch==']') {
				b--;
			}
			else if(ch=='{') {
				b++;
			}
			else if(ch=='}') {
				b--;
			}
			if(a<0||b<0||c<0) {
				{
				check=1;

				break;}
			}
			
			
	
		}
		if(check==0 && a==0 && b==0 && c==0) {
			System.out.println("its balanaced paranthesis");
		}
		else {
			System.out.println("not balanced parantheiss");
		}
		
		
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the String");
	String s=sc.next();
	checkparenthesiss(s);
	//string=(([]))
}
}
