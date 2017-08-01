package pat1002;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		double[] coeffs=new double[1001];
		int maxIndex=0;
		int num1=scanner.nextInt();
		for(int i=0;i<num1;i++)
		{
			int index=scanner.nextInt();
			double coeff=scanner.nextDouble();
			coeffs[index]=coeff;	
			if(index>maxIndex)
			{
				maxIndex=index;
			}
		}
		int num2=scanner.nextInt();
		for(int i=0;i<num1;i++)
		{
			int index=scanner.nextInt();
			double coeff=scanner.nextDouble();
			if(coeffs[index]==0)
			{
				coeffs[index]=coeff;	
			}
			else
			{
				coeffs[index]+=coeff;	
			}
			if(index>maxIndex)
			{
				maxIndex=index;
			}
		}
		
		int len=0;
		for(int i=maxIndex;i>=0;i--)
		{
			if(coeffs[i]!=0)
			{
				len++;
			}
		}
		System.out.print(len+" ");
		for (int i = maxIndex; i>0; i--)
		{
			if(coeffs[i]!=0)
			{
				System.out.print(i+" "+new DecimalFormat("#.0").format(coeffs[i])+" ");
			}
		}
		if(coeffs[0]>0)
		{
			System.out.println(0+" "+new DecimalFormat("#.0").format(coeffs[0]));
		}
	}
}
