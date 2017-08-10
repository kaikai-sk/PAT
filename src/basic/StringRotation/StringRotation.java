package basic.StringRotation;
import java.util.*;

public class StringRotation 
{
    public String rotateString(String A, int n, int p) 
    {
    	//after
        String sub1=A.substring(p+1,n);
        //the former
        String sub2=A.substring(0,p+1);
        return sub1+sub2;
    }
}