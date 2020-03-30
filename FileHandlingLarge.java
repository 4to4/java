import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingLarge
{

	public static void main(String[] args) throws IOException
	{
		/***** Large file readnidg with BuffferedReader->readLine(<file handle>) *****/
		String file = "D:/dev/large_dataset/rows.json";
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = null;
		
		/* simulate getchar() */
		while((line = br.readLine()) != null)
		{
			System.out.println("Line is " + line);
		}
		br.close();
		/******************************************************************************/
		
		/***** reading file character by character with FileReader->read() ************/
		try
		{
			FileReader rd = new FileReader(file);
			int char_cnt;
			while( (char_cnt = rd.read()) != -1 )
			{
//				System.out.println((char) char_cnt);
			}
			rd.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		/******************************************************************************/
		
		/***** reading whole file in one character buffer *****************************/
		char[] chars = new char[(int) file.length()];
		System.out.println("file length count" + file.length());
		FileReader rd2 = new FileReader(file);
		rd2.read(chars);
		String full_file = new String(chars);
		System.out.println( full_file + "\n\n\n All \n\n\n");
		rd2.close();
		/******************************************************************************/
		
	}
}


/* file reading
in byte mode

In text mode - 
Reading character by character or in a sized buffer is done with FileReader()->read()
read() is overloaded, allows you to read, few characters or more depending on the arugment
Takes offset as argument.

Large files -
Large files are read with BufferedReader.
	import java.io.BufferedReader;
	import java.io.FileReader;
	BufferedReader takes fileReader object as argument which can be used to ready next line
	with function br.readLine()

buffered
unbuffered
text
reading binary files
*/