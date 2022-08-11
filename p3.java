package IntroArrays;
import java.util.*;
public class p3 {
	public static void main(String[] args) {
		String arr[] = new String[7];
		arr[0]="abc.gmail.com";
		arr[1]="abcd.gmail.com";
		arr[2]="abce.gmail.com";
		arr[3]="abcf.gmail.com";
		Scanner sc=new Scanner(System.in);
		String valid=sc.next();
		for(String x:arr) {
			if(valid.equals(arr)) {
				System.out.println("email already exists");
				break;
			}
			else {
				System.out.println("register ");
				//arr[arr.length]=valid;
				break;
			}
		}
		int i=0;
		for(String x:arr) {
			if(x!=null) {
				i++;
			}
			else {
				break;
			}
		}
		arr[i]=valid;
		for(String x:arr) {
			System.out.println(x);
		}
	
		
	}

}
