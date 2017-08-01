package tsinghuashuzupaixu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext())
		{
			int numOfStudent=scanner.nextInt();
			Student[] stuArray=new Student[numOfStudent];
			for(int i=0;i<numOfStudent;i++)
			{
				stuArray[i]=new Student(scanner.nextInt(), scanner.nextInt());
			}
			Arrays.sort(stuArray, new Comparator<Student>()
			{
				public int compare(Student o1,Student o2)
				{
					int res;
					if(o1.score!=o2.score)
					{
						res=o1.score-o2.score;
					}
					else
					{
						res=o1.id-o2.id;
					}
					return res;
				}
			});
			for(int i=0;i<numOfStudent;i++)
			{
				System.out.println(stuArray[i].id+" "+stuArray[i].score);
			}
		}
	}
}

class Student
{
	public int id;
	public int score;
	public Student(int id,int score)
	{
		this.id=id;
		this.score=score;
	}
}
