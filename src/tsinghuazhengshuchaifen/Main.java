package tsinghuazhengshuchaifen;

import java.util.Scanner;

/**
 * 参考答案：http://blog.csdn.net/clamercoder/article/details/24363817
 * @author shand
 *
 */
public class Main
{
	static int[] f=new int[1000001];
	
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext())
		{
			int num=scanner.nextInt();
			System.out.println(fNew(num));
		}
	}

	private static int fNew(int num)
	{
		f[0]=f[1]=1;
		for(int i=2;i<=num;i++)
		{
			if(i%2!=0)//对奇数的处理
			{
				f[i]=f[i-1];
			}
			else if(i%2==0)//对偶数的处理
			{
				f[i]=(f[i-1]+f[i/2])%1000000000;
			}
		}
		return f[num];
	}
	
	/**
	 * 递归方式不行，栈溢出 
	 * Exception in thread "main" java.lang.StackOverflowError
	 * @param num
	 * @return
	 */
	private static int f(int num)
	{
		if(num==0 || num==1)
		{
			return 1;
		}
		if(num%2!=0)
		{
			return f(num-1);
		}
		else if(num%2==0)
		{
			return (f(num-1)+f(num/2))%1000000000;
		}
		return -1;
	}
}
