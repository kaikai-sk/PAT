package tsinghua.jiecheng;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext())
		{
			long n=scanner.nextInt();
			long res=1;
			for(int i=1;i<=n;i++)
			{
				res*=i;
			}
			System.out.println(res);
		}
	}
}
