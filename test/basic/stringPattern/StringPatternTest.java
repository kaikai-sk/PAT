package basic.stringPattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringPatternTest
{

	@Test
	public void test()
	{
		StringPattern pattern=new StringPattern();
		int pos=pattern.findAppearance("acbc", 4, "bc", 2);
		System.out.println(pos);
	}

}
