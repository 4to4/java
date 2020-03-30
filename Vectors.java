import java.util.Vector;
import java.util.Enumeration;

public class Vectors
{
   public static void main(String args[])
   {
	  /* ***** Vectors making use of Enums **** */
	  Enumeration<String> days;
      Vector<String> dayNames = new Vector<String>(); // it's always a good practice to specify type of generics within <>
      dayNames.add("Sunday");
      dayNames.add("Monday");
      dayNames.add("Tuesday");
      dayNames.add("Wednesday");
      dayNames.add("Thursday");
      dayNames.add("Friday");
      dayNames.add("Saturday");
      days = dayNames.elements();
      while (days.hasMoreElements()) {
         System.out.println(days.nextElement()); 
      }
      /* *********** classic enums ********************** */
   }
}