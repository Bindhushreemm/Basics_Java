
public class Exp12 {
	public void draw() {
		System.out.println("hello");
	}
}
class Exp13 extends Exp12{
	public void draw() {
		System.out.println("hey");
	}
	public static void main(String[] args) {
		Exp12 obj1=new Exp12();
		obj1.draw();
	}
}

