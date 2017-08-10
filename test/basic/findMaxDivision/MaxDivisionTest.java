package basic.findMaxDivision;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxDivisionTest
{

	@Test
	public void test()
	{
		int arr[]={9,3,1,10};
		MaxDivision division=new MaxDivision();
		System.out.println(division.findMaxDivision(arr, 4));
	}

}
