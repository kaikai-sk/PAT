package basic.stringFormat;

import java.util.*;

public class StringFormat
{
	public String formatString(String A, int n, char[] arg, int m)
	{
		int index=0;
		while(A.indexOf("%s")!=-1)
		{
			A=A.replaceFirst("%s", arg[index]+"");
			index++;
		}
		while(index<m)
		{
			A=A+arg[index];
			index++;
		}
		return A;
	}
}