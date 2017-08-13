package jindian.replaceSpace;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReplacementTest
{

	@Test
	public void test()
	{
		String resString=new Replacement().replaceSpace("Mr John Smith",13);
		System.out.println(resString);
		assertEquals("Mr%20John%20Smith", resString);
		resString=new Replacement().replaceSpace("Hello  World",12);
		System.out.println(resString);
		assertEquals("Hello%20%20World", resString);
	}

}
