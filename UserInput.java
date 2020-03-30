import java.util.Scanner;

public class UserInput
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine())
		{
			System.out.println("Line is " + sc.nextLine());
			if( sc.nextLine().equals("A") ) //nextLine will output the line
			{
				if (sc.hasNext())
				{
					System.out.println("AAAAA " + sc.next());
				}

				System.out.println("Found a. Bye");
				break;  // perl's last is break
			}
		}

		System.gc(); // called explicitly garbage collection
		sc.close();  // calling close() on scanner obj
	}
}
