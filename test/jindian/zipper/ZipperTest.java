package jindian.zipper;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZipperTest
{

	@Test
	public void test()
	{
		String resString=new Zipper().zipString("aabcccccaaa");
		assertEquals("a2b1c5a3",resString);
		resString=new Zipper().zipString("welcometonowcoderrrrr");
		assertEquals("welcometonowcoderrrrr",resString);
	}

}
