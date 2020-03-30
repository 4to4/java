import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Stream;
import java.math.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.script.ScriptEngine;



public class Assign {

	private int i=10;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(Calendar.getInstance().getTime());
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.now().toLocalTime());
		System.out.println(OffsetDateTime.now());
		System.out.println(ZonedDateTime.now());
		SimpleDateFormat sd = new SimpleDateFormat("dd-MMM-yyy");
//		System.out.println(sd.parse("02-03-2015"));
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		
		int c = a+b;
//		int d = Integer.parseInt(a) + Integer.parseInt(b);
//		int e = Math.addExact(a, b);

		
		try {
//			int g = 10/0;
			int numbers[] = new int[2] ;
			numbers[0] = 10;
			numbers[1] = 20;
			}
		finally
		{}
		
		
		List<String> con = new ArrayList<String>();
		con.add("Asia");
		con.forEach(System.out::println);

//		Stream.of("Mango", "Orange", "Banana").filter(fruit -> {System.out.println("Fruit:" + fruit);});

//		con.stream().forEach(
//				(name)->{
//					showSupplier(()->name);
//					}  
//				);
	}
	

}
