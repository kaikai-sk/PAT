package basic.zhi;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrinterTest
{

	@Test
	public void test()
	{
		int[][] mat={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		Printer printer=new Printer();
		int[] res=printer.printMatrix(mat, 4, 3);
		for (int i = 0; i < res.length; i++)
		{
			System.out.print(res[i]+" ");
		}
		System.out.println();
	}

}
