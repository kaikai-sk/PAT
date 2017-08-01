package tsinghuakeyboard;

import java.util.Scanner;

import javax.sound.sampled.Line;

public class Main
{
	public static void main(String[] args)
	{
		int alpha[]=new int[]{
				1,2,3,
				1,2,3,
				1,2,3,
				1,2,3,
				1,2,3,
				1,2,3,4,
				1,2,3,
				1,2,3,4
		};
		int keys[]=new int[]
		{
			1,1,1,
			2,2,2,
			3,3,3,
			4,4,4,
			5,5,5,
			6,6,6,6,
			7,7,7,
			8,8,8,8
		};
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext())
		{
			int times=0;
			String line=scanner.next();
			char pre=line.charAt(0);
			times+=alpha[pre-'a'];
			for(int i=1;i<line.length();i++)
			{
				char currentChar=line.charAt(i);
				times+=alpha[currentChar-'a'];
				if(keys[pre-'a']==keys[currentChar-'a'])
				{
					times+=2;
				}
				pre=currentChar;
			}
			System.out.println(times);
		}
	}
}
