package basic.findMaxDivision;
import java.util.*;

public class MaxDivision 
{
    public int findMaxDivision(int[] A, int n)
    {
    	int minNum=Integer.MAX_VALUE;
    	int maxNum=Integer.MIN_VALUE;
    	
    	for(int i=0;i<n;i++)
    	{
    		if(A[i]>maxNum)
    		{
    			maxNum=A[i];
    		}
    		if(A[i]<minNum)
    		{
    			minNum=A[i];
    		}
    	}
    	
    	int buckets[]=new int[maxNum-minNum+1];
    	for(int i=0;i<n;i++)
    	{
    		buckets[A[i]-minNum]++;
    	}
    	
    	int count=0;
    	int max=0;
    	for(int i=0;i<buckets.length;i++)
    	{
    		if(buckets[i]==0)
    		{
    			count++;
    		}
    		else
    		{
    			if(count>max)
    			{
    				max=count;
    			}
				count=0;
			}
    	}
    	return max+1;
    }
}