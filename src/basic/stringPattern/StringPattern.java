package basic.stringPattern;
import java.util.*;

public class StringPattern
{
    public int findAppearance(String A, int lena, String B, int lenb) 
    {
    	if(lena<lenb)
    	{
    		return -1;
    	}
    	else if (lena==lenb)
    	{
    		if(A.equals(B))
    		{
    			return 0;
    		}
    		else
    		{
    			return -1;
			}
		}
    	
    	int i=0;
    	while(i<=lena-lenb)
    	{
    		String temp=A.substring(i,i+lenb);
    		if(temp.equals(B))
    		{
    			return i;
    		}
    		i++;
    	}
    	return -1;
    }
}