package java_examples;

public class stringsExample {
	public static void main(String[] args) {
String name = "ravi";
String name1 = "teja";

System.out.println("first name is "+name);
System.out.println("last name is "+name1);
System.out.println(" length of first name is "+name.length());
System.out.println("first name in upper case "+name.toUpperCase());
System.out.println("first name in lower case "+name.toLowerCase());
System.out.println("first name &Last name "+name.concat(name1));
System.out.println("first name in upper case "+name.concat(name1));
 if(name.startsWith("r"))
 {
	 System.out.println(name+"  name starts with  'r' ");
	 System.out.println("modified name "+name.replace("r", "s"));	 
 }
  if(name.equals(name1))
		 {
	 System.out.println("first name &Last name are same");
		 }
 else
 {
	 System.out.println("first name &Last name are notsame-------------!"); 
}
}
}