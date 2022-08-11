
public class Exp10 {
	public int method1(int x,int y) {
		int sum;
		sum=x+y;
		System.out.println("this is method with returning values");
		return sum;
	}
	//method not taking arguments and value
	public void method2() {
		System.out.println("no arguments and no return");
	}
	
	//method taking arguments and not returning the values
	public void method3(int x) {
		System.out.println(x);
		
	}
	
    ///no arguments and return
	public String method4() {
		String x;
		x="bindhu";
		return x;
		
	}
	public static void main(String[] args) {
		Exp10 obj1=new Exp10();
		obj1.method1(10, 200);
		obj1.method2();
		obj1.method3(10);
		String a=obj1.method4();
		System.out.println(a);
		
		
	}

}
