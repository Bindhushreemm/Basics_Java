package p1;

class ValidateData1 {
    public int id ;
	public int rol=1010;
	public String name="java";
	public String clg="dsatm";
	public int score=87;
	public String city="bangalore";
	

}
public class ValidateData extends ValidateData1
{
	public void stddetails() {
		if(score>=60)
		{
			System.out.println("vit");
		}
		else if(score>=70) {
			System.out.println("bit");
		}
		else if(score>=80) {
			System.out.println("nit");
		}
		else {
			System.out.println("iit");
		}
	}
	
	
}
