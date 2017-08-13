package jindian.diffChar;

import static org.junit.Assert.*;

import org.junit.Test;

public class DifferentTest
{

	@Test
	public void test()
	{
		Different different=new Different();
		boolean res=different.checkDifferent("aeiou");
		System.out.println(res);
	}
	
}
