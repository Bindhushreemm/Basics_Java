package p2;

import p3.demo1;

//import p3.demo1;

public class demo2 {
	demo1 obj1=new demo1();
	public int id;
	public String name;
	public void display()
	{
		System.out.println(obj1.id+","+obj1.name);
		obj1.show();
	}

}
