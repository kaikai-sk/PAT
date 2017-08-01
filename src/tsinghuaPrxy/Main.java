package tsinghuaPrxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext())
		{
			//输入部分
			int prxyNum=scanner.nextInt();
			List<String> prxyList=new ArrayList<String>();
			for(int i=0;i<prxyNum;i++)
			{
				prxyList.add(scanner.next());
			}
			int serverNum=scanner.nextInt();
			List<String>serverList=new ArrayList<String>();
			for(int i=0;i<serverNum;i++)
			{
				serverList.add(scanner.next());
			}
			
			if(prxyNum==1)
			{
				if(searchIdx(serverList,prxyList.get(0),0)>=0)
				{
					System.out.println(-1);
				}
				else
				{
					System.out.println(0);
				}
			}
			else
			{
				System.out.println(skcountConvertion(prxyList, serverList, 0)+"");
			}
		}
	}

	/**
	 * 计算转换代理的次数
	 * @param start
	 * @return
	 */
	private static int skcountConvertion(List<String> prxyList,List<String> serverList,int start)
	{
		int maxId = 0;
		int res=0;
		
		for(int i=0;i<prxyList.size();i++)
		{
			int idx=searchIdx(serverList, prxyList.get(i),start);
			if(idx==-1)
			{
				return 0;
			}
			else if(idx>maxId)
			{
				maxId=idx;
			}
		}
		return 1+skcountConvertion(prxyList, serverList, maxId);
	}

	/**
	 * 从一个列表中查找字符串
	 * @param serverList 一个列表
	 * @param string    要查找的字符串
	 * @return 查找到的字符纯的index
	 */
	private static int searchIdx(List<String> list, String string,int start)
	{
		//int maxIndex=-1;
		for(int i=start;i<list.size();i++)
		{
			if(string.equals(list.get(i)))
			{
				return i;
			}
		}
		return -1;
	}
}
