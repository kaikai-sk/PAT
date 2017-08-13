package jindian.zipper;
import java.util.*;

public class Zipper
{
    public String zipString(String iniString) 
    {
    	int size=countCompression(iniString);
    	if(size>=iniString.length())
    	{
    		return iniString;
    	}
    	
    	StringBuffer myString=new StringBuffer();
    	char last=iniString.charAt(0);
    	int count=1;
    	for(int i=1;i<iniString.length();i++)
    	{
    		if(last==iniString.charAt(i))
    		{
    			count++;
    		}
    		else
    		{
    			myString.append(last);
    			myString.append(count);
    			last=iniString.charAt(i);
    			count=1;
    			
			}
    	}
		myString.append(last);
		myString.append(count);
		return myString.toString();
    }
    
    int countCompression(String str)
    {
    	if(str==null || str.isEmpty())
    	{
    		return 0;
    	}
    	char last=str.charAt(0);
    	int size=0;
    	int count=1;
    	for(int i=1;i<str.length();i++)
    	{
    		if(last==str.charAt(i))
    		{
    			count++;
    		}
    		else
    		{
    			last=str.charAt(i);
    			count=1;
    			size+=1+String.valueOf(count).length();
			}
    	}
    	size+=1+String.valueOf(count).length();
    	return size;
    }
}