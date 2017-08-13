package jindian.replaceSpace;
import java.util.*;

public class Replacement
{
    public String replaceSpace(String iniString, int length) 
    {
    	int spaceCount=0,newLength=0;
    	for(int i=0;i<length;i++)
    	{
    		if(' '==iniString.charAt(i))
    		{
    			spaceCount++;
    		}
    	}
    	
    	newLength=length+2*spaceCount;
    	char[] str=new char[newLength];
    	for(int i=length-1;i>=0;i--)
    	{
    		if(iniString.charAt(i)==' ')
    		{
    			str[newLength-1]='0';
    			str[newLength-2]='2';
    			str[newLength-3]='%';
    			newLength-=3;
    		}
    		else
    		{
    			str[newLength-1]=iniString.charAt(i);
    			newLength--;
			}
    	}
    	return String.valueOf(str);
    }
}