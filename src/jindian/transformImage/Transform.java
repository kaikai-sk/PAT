package jindian.transformImage;
import java.util.*;

public class Transform 
{
	/**
	 * 先上下交换，再按主对角线交换
	 * @param mat
	 * @param n
	 * @return
	 */
    public int[][] transformImage(int[][] mat, int n) 
    {
    	//上下交换
    	for(int i=0;i<n/2;i++)
    	{
    		for(int j=0;j<n;j++)
    		{
    			int temp=mat[i][j];
    			mat[i][j]=mat[n-i-1][j];
    			mat[n-i-1][j]=temp;
    		}
    	}
    	//按主对角线交换
    	for(int i=0;i<n;i++)
    	{
    		for(int j=0;j<i;j++)
    		{
    			int temp=mat[i][j];
    			mat[i][j]=mat[j][i];
    			mat[j][i]=temp;
    		}
    	}
    	return mat;
    }
}