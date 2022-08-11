//iteration loops
//1.for loop
//2.while loop
//3.do-while loop
//4.for each loop
public class exp7{
	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			System.out.print(i);
			if(i<10) {
				System.out.print(",");
			}
		}
		int y=10;
		while(y>=0) {
			System.out.print(y);
			y--;
			
		}
		int z=10;
		do {
			System.out.print(z);
		z++;
		}while(z>=0);
	}
}
