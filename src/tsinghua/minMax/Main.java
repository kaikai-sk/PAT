package tsinghua.minMax;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext())
		{
			int numOfNum=scanner.nextInt();
			int min=Integer.MAX_VALUE;
			int max=Integer.MIN_VALUE;
			for(int i=0;i<numOfNum;i++)
			{
				int tempNum=scanner.nextInt();
				if(tempNum<min)
					min=tempNum;
				if(tempNum>max)
					max=tempNum;
			}
			System.out.println(max+" "+min);
		}
	}
}
