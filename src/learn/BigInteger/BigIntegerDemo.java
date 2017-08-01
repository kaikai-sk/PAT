package learn.BigInteger;

import java.math.BigInteger;;

public class BigIntegerDemo
{
	public static void main(String[] args)
	{
		BigInteger big=BigInteger.ONE;
		System.out.println("BigInteger.ONE"+big);
		/**
		 * nextProbablePrime（）返回刚好大于参数的质数
		 */
		System.out.println("nextProbablePrime"+big.nextProbablePrime());
		System.out.println("nextProbablePrime"+big.nextProbablePrime());
		
		big=BigInteger.TEN;
		System.out.println("BigInteger.TEN:"+big);
		
		big=BigInteger.ZERO;
		System.out.println("BigInteger.ZERO:"+big);
	}
}
