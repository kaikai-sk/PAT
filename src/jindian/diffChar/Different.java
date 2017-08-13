package jindian.diffChar;

import java.util.*;

public class Different
{
	public boolean checkDifferent(String iniString)
	{
		for(int i=0;i<iniString.length();i++)
		{
			for(int j=i+1;j<iniString.length();j++)
			{
				if(iniString.charAt(i)==iniString.charAt(j))
				{
					return false;
				}
			}
		}
		return true;
		
		
//		if(iniString.length()>256)
//			return false;
//		boolean char_set[]=new boolean[256];
//		for(int i=0;i<iniString.length();i++)
//		{
//			int val=iniString.charAt(i);
//			if(char_set[val])
//			{
//				return false;
//			}
//			char_set[val]=true;
//		}
//		return true;
	}
}