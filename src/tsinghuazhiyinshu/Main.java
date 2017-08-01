package tsinghuazhiyinshu;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext())
		{
			int num=scanner.nextInt();
			int count=0;
			for(int j=2;j*j<=num;j++)
			{
				while(num%j==0)
				{
					num/=j;
					count++;
				}
				if(num<=1)
					break;
			}
			if(num>1)
				count++;
			System.out.println(count);
		}
	}
}
