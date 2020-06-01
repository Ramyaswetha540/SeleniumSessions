package objectclass;

public class Dog {
	
	String fname;
	String lname;
	
	
	Dog(String fname,String lname)
	{
		this.fname=fname;
		this.lname=lname;
	}

	public String toString()// overriding tostring() of object  --as object class is the parent class
	{
		//when u override u can see green arrow near line number
		return fname + lname;
		
	}
	public static void main(String[] args) {
		
		Dog d1=new Dog("minne","mouse");
		System.out.println(d1);
		
		Dog d2=new Dog("john","peter");
		System.out.println(d2);
	}

}
