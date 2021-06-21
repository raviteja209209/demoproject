package java_examples;
// this is malt-level inheritance
class addition1 {
			   public int add ()  // parent class or super class
			  {
				  int a=120;
				  int b=20;
				  int sum1 =a+b;
				  return sum1;
			  }			
			}	
		class subtraction2 extends addition1 {  // child class or sub class
			 public int sub ()
			  {
				  int a=50;
				  int b=20;
				  int sum2 =a-b;
				  return sum2;
			  }	
		}
		class multiplication3 extends subtraction2  {  // grand-child class 
			 public int mul ()
			  {
				  int a=50;
				  int b=20;
				  int sum3 =a*b;
				  return sum3;
			  }	
		}
		public class multilevelinhertence {		
				public static void main(String[] args) {
					multiplication3 obj = new multiplication3();
					int result1 =obj.add();
					int result2 =obj.sub();
					int result3 =obj.mul();
					System.out.println("the adddition of  two numbers is "+result1);
					System.out.println("the subtraction of  two numbers is "+result2);
					System.out.println("the mutliplication of  two numbers is "+result3);
				} 
		 }			 
