package objectclass;

public class Objectconcept extends Object{

	public static void main(String[] args) {
		// object class is the super class of all classes 
		//if you extend the class to object it will not give error
		
		Objectconcept o=new Objectconcept();
		System.out.println(o.getClass());//like this u can access object methods using class name
	   //tostring() package name classname @ addressofheapmem where obj is stores
		System.out.println(o.toString());
		
		System.out.println(o);
		
		//if you want to print o and don't want address to be printed create one dog class
		
		
		

	}

}
