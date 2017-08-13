package jindian.transformImage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TransformTest
{

	@Test
	public void test()
	{
		int[][] res=new Transform().transformImage(new int[][]{{1,2,3},{4,5,6},{7,8,9}},3);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}

}
