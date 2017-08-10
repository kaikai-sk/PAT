package basic.matrixRotate;
import java.util.*;

public class Rotate
{
    public int[][] rotateMatrix(int[][] mat, int n) 
    {
    	int[][] temp=new int[n][n];
    	
    	for(int i=0;i<n;i++)
    	{
    		for(int j=0;j<n;j++)
    		{
    			temp[j][n-i-1]=mat[i][j];
    		}
    	}
    	
    	return temp;
    }
}