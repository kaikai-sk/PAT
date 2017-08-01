package tsinghua.nianyueri;

import java.util.Scanner;

public class Main
{
	static int[] yues=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
	
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext())
		{
			int nian=scanner.nextInt();
			int yue=scanner.nextInt();
			int day=scanner.nextInt();
			int sum=0;
			for(int i=0;i<yue-1;i++)
			{
				sum+=yues[i];
			}
			sum+=day;
			if(isRunNian(nian) && yue>2)
			{
				sum+=1;
			}
			System.out.println(sum);
		}
	}

	private static boolean isRunNian(int nian)
	{
		if(nian%100==0)
		{
			if(nian%400==0)
				return true;
			else
			{
				return false;
			}
		}
		else if(nian%4==0)
			return true;
		else
		{
			return false;	
		}
		
	}
}
