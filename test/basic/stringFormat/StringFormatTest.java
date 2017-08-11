package basic.stringFormat;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringFormatTest
{

	@Test
	public void test()
	{
		StringFormat format=new StringFormat();
		String resString=format.formatString("A%sC%sE",7,new char[]{'B','D','F'},3);
		System.out.println(resString);
	}

}
