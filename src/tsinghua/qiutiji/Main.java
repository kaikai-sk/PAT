package tsinghua.qiutiji;

import java.util.Scanner;

public class Main
{
	static double PI=Math.acos(-1);
	
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext())
		{
			Point center=new Point(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
			Point point=new  Point(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
			double R=distance(center,point);
			double V=(4.0/3.0)*PI*R*R*R;
			System.out.printf("%.3f %.3f\n",R,V);
		}
	}

	private static double distance(Point center, Point point)
	{
		double r=Math.sqrt(Math.pow((center.x-point.x), 2)+
				Math.pow((center.y-point.y), 2)+
				Math.pow((center.z-point.z), 2));
		return r;
	}
}

class Point
{
	double x;
	double y;
	double z;
	public Point(double x,double y,double z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
}