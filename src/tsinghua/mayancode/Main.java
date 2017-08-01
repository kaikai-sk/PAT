package tsinghua.mayancode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext())
		{
			int num=scanner.nextInt();
			String codeString=scanner.next();
			int moveTime=getMoveTime(codeString,num);
			System.out.println(moveTime);
		}
	}

	private static int getMoveTime(String codeString, int num)
	{
		if(num<4)
			return -1;
		ArrayList<String> record=new ArrayList<String>();
		Queue<StringNum> queue=new LinkedList();
		StringNum stringNum=new StringNum(codeString, 0);
		queue.offer(stringNum);
		record.add(codeString);
		while(!queue.isEmpty())
		{
			stringNum=queue.remove();
			if(stringNum.string.contains("2012"))
			{
				return stringNum.num;
			}
			for(int i=0;i<num-1;i++)
			{
				char[] temp=stringNum.string.toCharArray();
				swap(temp,i,i+1);
				String tempString=new String(temp);
				if(!record.contains(tempString))
				{
					record.add(tempString);
					queue.offer(new StringNum(tempString, stringNum.num+1));
				}
			}
		}//end while
		return -1;
	}//function end

	private static void swap(char[] charArr, int i, int j)
	{
		char temp=charArr[i];
		charArr[i]=charArr[j];
		charArr[j]=temp;
	}
	
	
}

class StringNum
{
	public String string;
	/**
	 * 变换的次数
	 */
	public int num;
	StringNum(String string,int num)
	{
		this.string=string;
		this.num=num;
	}
}