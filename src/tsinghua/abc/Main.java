package tsinghua.abc;

public class Main
{
	public static void main(String[] args)
	{
		int a,b,c;
		for(a=0;a<=9;a++)
		{
			for(b=0;b<=9;b++)
			{
				for(c=0;c<=9;c++)
				{
					if(a*100+b*10+c+b*100+c*10+c==532)
					{
						System.out.println(a+" "+b+" "+c);
					}
				}
			}
		}
	}
}
