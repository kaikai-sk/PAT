package tsinghua.specialMulti;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext())
		{
			String yinshu1=scanner.next();
			String yinshu2=scanner.next();
			int sum=0;
			for(int i=0;i<yinshu1.length();i++)
			{
				for(int j=0;j<yinshu2.length();j++)
				{
					sum+=Integer.parseInt(yinshu1.charAt(i)+"")*Integer.parseInt(yinshu2.charAt(j)+""
							);
				}
			}
			System.out.println(sum);
		}
	}
}
