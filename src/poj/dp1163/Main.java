package poj.dp1163;

import java.util.Scanner;

public class Main
{
	private static int N;
	private static int[][] D;
	private static int[] maxSum;
	
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		N=scanner.nextInt();
		D=new int[N][N];
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<=i;j++)
			{
				D[i][j]=scanner.nextInt();
			}
		}
		maxSum=new int[N];
		for(int i=0;i<N;i++)
		{
			maxSum[i]=D[N-1][i];
		}
		for(int i=N-2;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				maxSum[j]=Math.max(maxSum[j], maxSum[j+1])+D[i][j];
			}
		}
		System.out.println(maxSum[0]);
	}
}
