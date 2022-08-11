package IntroArrays;

public class p1 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
			
		}
		System.out.println();
		String[] names=new String[5];
		names[4]="String";
		System.out.println(names.length);
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		System.out.println(names[5]);
		//System.out.println(names[0].equals("java"));
	}

}
