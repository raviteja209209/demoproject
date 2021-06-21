package java_examples;

public class additionofnumbers {
  int a=10;
  int b=20;
  
  int add ()
  {
	  int sum =a+b;
	  return sum;
  }
	public static void main(String[] args) {
		additionofnumbers obj = new additionofnumbers();
		System.out.println("a value is  "+obj.a);
		System.out.println("b value is "+obj.b);
		int result =obj.add();
		System.out.println("the adddition of  two numbers is "+result);
		
	}
}
