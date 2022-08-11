//method overloading
public class Exp11 {
	
	public void add(int x) {
		System.out.println(x);
	}
	
	public void add(double x) {
		System.out.println(x);
	}
	
	public void add(int x,float y) {
		System.out.println(x+","+y);
		
	}
	public void add(float x,int y) {
		System.out.println(x+","+y);
	}
	public static void main(String[] args) {
		Exp11 obj1=new Exp11();
		obj1.add(10);
		obj1.add(10.009);
		obj1.add(10, 10.2f);
		obj1.add(10.09f, 20);
		
		
	}

}
