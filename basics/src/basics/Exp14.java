
class exp114 {
	public void draw() {
		System.out.println("hello");
	}
}
class Exp15 extends exp114{
	
	public void draw() {
		super.draw();
		System.out.println("hey");
	}
	
}
public class Exp14{
	public static void main(String[] args) {
		Exp15 obj1=new Exp15();
		obj1.draw();
	}
}
	