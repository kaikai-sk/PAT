package basic.matrixRotate;

import static org.junit.Assert.*;

import org.junit.Test;

public class RotateTest
{

	@Test
	public void test()
	{
		int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
		Rotate rotate=new Rotate();
		int[][] res=rotate.rotateMatrix(mat, 3);
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.print(res[i][j]);
			}
			System.out.println();
		}
	}

}
