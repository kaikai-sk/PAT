package jindian.tonggou;

import static org.junit.Assert.*;

import org.junit.Test;

public class SameTest
{

	@Test
	public void test()
	{
		boolean res=new Same().checkSam("Here you are","Are you here");
		System.out.println(res);
		res=new Same().checkSam("This is nowcoder","is This nowcoder");
		System.out.println(res);
	}

}
