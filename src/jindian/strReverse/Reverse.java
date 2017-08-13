package jindian.strReverse;
import java.util.*;


public class Reverse
{
    public String reverseString(String iniString) 
    {
    	int start=0;
    	int end=iniString.length()-1;
    	char[] charArr=iniString.toCharArray();
    	while(start<end)
    	{
    		char temp=charArr[start];
    		charArr[start]=charArr[end];
    		charArr[end]=temp;
    		
    		start++;
    		end--;
    	}
    	return String.valueOf(charArr);
    }
}