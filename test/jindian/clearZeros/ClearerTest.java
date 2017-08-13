package jindian.clearZeros;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClearerTest
{

	@Test
	public void test()
	{
		int[][] res=new Clearer().clearZero(new int[][]{{1,2,3},{0,1,2},{0,0,1}}, 3);
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[0].length;j++)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}

}
