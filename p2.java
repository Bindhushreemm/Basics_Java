package IntroArrays;
class Student{
	private int id;
	private String name;
	private String city;
	public Student() {
		
	}
	public Student(int id,String name,String city) {
		this.id=id;
		this.name=name;
		this.city=city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}

public class p2 {
	public static void main(String[] args) {
		Student[] Data=new Student[5];
		Student std1=new Student(11,"bang","kolar");
		Student std2=new Student(12,"bange","kolar");
		Student std3=new Student(13,"bange","kolar");
		Student std4=new Student(14,"banie","kolar");
		Student std5=new Student(15,"bangol","kolar");
		
		Data[0]=std1;
		Data[1]=std2;
		Data[2]=std3;
		Data[3]=std4;
		Data[4]=std5;
		
		for(Student obj:Data) {
			System.out.println("id:"+obj.getId()+"   "+"name:"+obj.getName()+"   "+"city:"+obj.getCity());
		}
		
	}
	

}
