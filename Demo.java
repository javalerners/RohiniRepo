public class Demo
{
	String name="Rohini";
	int age=32;
	char gender='F';

	public void Info(){
	
		System.out.println("my name is :"+name);
		System.out.println("my age is :"+age);
		System.out.println("my gender is :"+gender);
	}

	public static void main (String [] args){
	
		Demo dm=new Demo();
		dm.Info();
	}



}