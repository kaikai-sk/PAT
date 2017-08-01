package tsinghuayueshu;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext())
		{
			int num=scanner.nextInt();
			int[] res=new int[num];
			for(int i=0;i<num;i++)
			{
				int shu=scanner.nextInt();
				res[i]=yueShuOfNum(shu);
			}
			for(int i=0;i<num;i++)
			{
				System.out.println(res[i]);
			}
		}
	}

	private static int yueShuOfNum(int num)
	{
		int count=0;
		int i;
		for(i=1;i*i<num;i++)
		{
			if(num%i==0)
				count+=2;
		}
		if(i*i==num)
			count+=1;
		
		return count;
	}
}
