package tsinghua.wanshuyingshu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	static int isWanshu=1;
	static int isYingshu=2;
	
	public static void main(String[] args)
	{
			ArrayList<Integer> E=new ArrayList<Integer>();
			ArrayList<Integer> G=new ArrayList<Integer>();
			for(int i=2;i<=60;i++)
			{
				if(wanShuOrYingshu(i)==isWanshu)
				{
					E.add(i);
				}
				else if(wanShuOrYingshu(i)==isYingshu)
				{
					G.add(i);
				}
			}
			System.out.print("E:");
			for(int i=0;i<E.size();i++)
			{
				System.out.print(" "+E.get(i));
			}
			System.out.println();
			
			System.out.print("G:");
			for(int i=0;i<G.size();i++)
			{
				System.out.print(" "+G.get(i));
			}
			System.out.println();
	}

	public static int wanShuOrYingshu(int n)
	{
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				sum+=i;
		}
		if(sum==n)
			return isWanshu;
		else if(sum>n)
			return isYingshu;
		return -1;
	}
}
