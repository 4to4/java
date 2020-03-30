public class StringComparision {

	public static void main(String[] args)
	{
		// equal() function is used to compare string values
		// == operator is used to compare if two objects are the same
		// both will return boolean values

		String str = "abc";
		String str1 = new String("xyz");  // different way of defining an object
		
		System.out.println(str.equals("abc")); // will be true
		System.out.println(str1.equals(str)); // will be true
		System.out.println(str1 == str); // will be false since it's comparing object 

		
		// calling equals() or == over null values will generate an exception e.g.
		String nullstr = null;
		
//		System.out.println(nullstr.equals("S")); --> this will create an exception
		System.out.println(nullstr == "S"); //this will be work
	}
	
}
