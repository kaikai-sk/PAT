package basic.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class FlipTest
{

	@Test
	public void test()
	{
		int[][] A={{0,0,1,1},{1,0,1,0},{0,1,1,0},{0,0,1,0}};
		int[][] f={{2,2},{3,3},{4,4}};
		
		Flip flip=new Flip();
		int[][] res=flip.flipChess(A, f);
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[i].length;j++)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
