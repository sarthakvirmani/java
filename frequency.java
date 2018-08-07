import java.util.*;
import java.io.*;
class frequency
{
	public static void main(String args[])
			throws IOException
	{
		BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in));
		System.out.println("Enter a string");
		String a=br.readLine();
		int hash[]=new int[150];
		for(int i=0;i<a.length();i++)
		{
			char c = a.charAt(i);  
			int asc=c;
			if(asc!=32)
			hash[asc]++;
		}
		for(int i=0;i<150;i++)
		{
			if(hash[i]>0)
			{
				System.out.print((char)i+" "+hash[i]);
			}
		}
		
	}
	
}
