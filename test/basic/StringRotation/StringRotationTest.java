package basic.StringRotation;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringRotationTest
{

	@Test
	public void test()
	{
		StringRotation rotation=new StringRotation();
		System.out.println(rotation.rotateString("ABCDEFGH", 8, 4));
	}

}
