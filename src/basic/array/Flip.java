package basic.array;
import java.util.*;

public class Flip {
    public int[][] flipChess(int[][] A, int[][] f) 
    {
    	for(int i=0;i<f.length;i++)
    	{
    		int x=f[i][0]-1;
    		int y=f[i][1]-1;
    		
    		if(isInChessBoard(x-1, y, A))
    		{
    			reverse(x-1, y, A);
    		}
    		if(isInChessBoard(x+1, y, A))
    		{
    			reverse(x+1, y, A);
    		}
    		if(isInChessBoard(x, y-1, A))
    		{
    			reverse(x, y-1, A);
    		}
    		if(isInChessBoard(x, y+1, A))
    		{
    			reverse(x, y+1, A);
    		}
    	}
    	return A;
    }
    
    public void reverse(int x,int y,int[][] A)
    {
    	if(A[x][y]==0)
    	{
    		A[x][y]=1;
    	}
    	else if(A[x][y]==1)
    	{
    		A[x][y]=0;
    	}
    }
    
    public boolean isInChessBoard(int x,int y,int[][] A)
    {
    	if(x<0 || x>A.length-1 || y<0 || y>A[0].length-1)
		{
    		return false;
		}
    	return true;
    }
} 