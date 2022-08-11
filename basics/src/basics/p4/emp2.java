package p4;

import ass1.Emp;

public class emp2 {
	Emp obj=new Emp();
	public emp2(int id) {
		System.out.println(id);
	}
	public emp2(double salary,int service) {
		if(service>5) {
			//System.out.println(salary);
			salary=(double) salary*0.05;
			
			System.out.println("bonus is :"+salary);
			
		}
		else {
			System.out.println("no bonus");
		}
		
	}

}
