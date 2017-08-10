package basic.zhi;
import java.util.*;

public class Printer
{
    public int[] printMatrix(int[][] mat, int n, int m) 
    {
    	int[] res=new int[n*m];
    	int resIndex=0;
    	
    	
    	for(int i=0;i<n;i++)
    	{
    		if(i%2==0)
    		{
    			for(int j=0;j<m;j++)
    			{
    				res[resIndex++]=mat[i][j];
    			}
    		}
    		else
    		{
    			for(int j=m-1;j>=0;j--)
    			{
    				res[resIndex++]=mat[i][j];
    			}
			}
    	}
    	return res;
    }
}