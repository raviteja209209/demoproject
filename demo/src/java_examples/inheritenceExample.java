package java_examples;
// this is single  level inheritence
class addition {
	  
	   public int add ()  // parent class or super class
	  {
		  int a=120;
		  int b=20;
		  int sum =a+b;
		  return sum;
	  }			
	}	
class subtraction extends addition {  // child class or sub class
	 public int sub ()
	  {
		  int a=50;
		  int b=20;
		  int sum =a-b;
		  return sum;
	  }	
}

 public class inheritenceExample {
		
		public static void main(String[] args) {
			subtraction obj = new subtraction();
			int result1 =obj.add();
			int result2 =obj.sub();
			System.out.println("the adddition of  two numbers is "+result1);
			System.out.println("the subtraction of  two numbers is "+result2);
		} 
 }	
			
 
