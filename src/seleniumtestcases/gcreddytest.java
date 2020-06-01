package seleniumtestcases;

public class gcreddytest {
	
	
	public static void main(String[] args)
     {
     	gcreddy test=new gcreddy();
//		test.startup();
//		test.login("gcreddy", "Temp@2020");
//		test.capturecurrenturl();
//		test.verifylogoff();
//		test.teardown();
//		Testcase2 catalogobj=new Testcase2();
//	     catalogobj.startup();
//	     catalogobj.onlinecatalog();
//	     catalogobj.currenturl();
//	     catalogobj.teardown();
	     
	   test.startup();
	   test.invalidlogin("gcreddy","temo2010");
	   test.teardown();
	     
	    
	     
	}

}
