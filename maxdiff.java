import java.util.*;
import java.io.*;
class maxdiff
{
public static void main(String args[])
{
	int arr[]=new int[]{12,7,5,4,6,2};
	int k=0;
	int large=0,small=99999;
	for(int i=0;i<5;i++)
	{
		if(small>arr[i])
		{
			if(i!=5)
			{
			small=arr[i];
			k=i;
			}
		}
		if(large<arr[i] && i>k)
		{
			large=arr[i];
		}
	}
		System.out.println(large-small);
}
}