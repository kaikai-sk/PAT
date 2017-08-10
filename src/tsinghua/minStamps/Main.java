package tsinghua.minStamps;

import java.util.Scanner;

import javax.swing.text.html.CSS;

public class Main
{
	static int wantM;
	static int stampNum;
	static int[] stampFaceValue;
	static int[] dpStamps;
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext())
		{
			wantM=scanner.nextInt();
			stampNum=scanner.nextInt();
			stampFaceValue=new int[stampNum];
			for(int i=0;i<stampNum;i++)
			{
				stampFaceValue[i]=scanner.nextInt();
			}
			
			dpStamps=new int[wantM+1];
			for(int i=1;i<=wantM;i++)
			{
				dpStamps[i]=100;
			}
			for(int i=0;i<stampNum;i++)
			{
				for(int j=wantM;j>=stampFaceValue[i];j--)
				{
					dpStamps[j]=Math.min(dpStamps[j], dpStamps[j-stampFaceValue[i]]+1);
					System.out.println("("+i+","+j+") ");
					printArray(dpStamps);
				}
			}
			if(dpStamps[wantM]==100)
			{
				System.out.println(0);
			}
			else
			{
				System.out.println(dpStamps[wantM]);
				
			}
			
		}
		
	}
	
	public static void printArray(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
