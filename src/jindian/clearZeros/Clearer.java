package jindian.clearZeros;
import java.util.*;

public class Clearer 
{
    public int[][] clearZero(int[][] mat, int n) 
    {
    	boolean[] row=new boolean[mat.length];
    	boolean[] column=new boolean[mat[0].length];
    	
    	//记录为0的位置
    	for(int i=0;i<n;i++)
    	{
    		for(int j=0;j<n;j++)
    		{
    			if(mat[i][j]==0)
    			{
    				row[i]=true;
    				column[j]=true;
    			}
    		}
    	}
    	
    	//进行清零工作
    	for(int i=0;i<n;i++)
    	{
    		for(int j=0;j<n;j++)
    		{
    			if(row[i] || column[j])
    			{
    				mat[i][j]=0;
    			}
    		}
    	}
    	return mat;
    }
}