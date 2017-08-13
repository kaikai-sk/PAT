package jindian.ReverseEqual;
import java.util.*;

public class ReverseEqual 
{
    public boolean checkReverseEqual(String s1, String s2)
    {
        if(s1.length()==s2.length())
        {
        	String ss=s1+s1;
        	if(ss.contains(s2))
        	{
        		return true;
        	}
        	return false;
        }
        return false;
    }
}