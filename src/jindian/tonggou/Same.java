package jindian.tonggou;

import java.util.*;

public class Same
{
	public boolean checkSam(String stringA, String stringB)
	{
		if(stringA.length()!=stringB.length())
		{
			return false;
		}
		
		//假设为Ascii字符集
		int[] letters=new int[256];
		
		for(int i=0;i<stringA.length();i++)
		{
			int val=stringA.charAt(i);
			letters[val]++;
		}
		
		for(int i=0;i<stringB.length();i++)
		{
			int val=stringB.charAt(i);
			if(--letters[val]<0)
			{
				return false;
			}
		}
		return true;
		
//		if(stringA.length()!=stringB.length())
//		{
//			return false;
//		}
//		if(sort(stringA).equals(sort(stringB)))
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
	}

	private Object sort(String string)
	{
		char[] cArr=string.toCharArray();
		Arrays.sort(cArr);
		return String.valueOf(cArr);
	}
}