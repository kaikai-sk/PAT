package basic.max;

import java.lang.reflect.Array;
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
			int studentNumN=scanner.nextInt();
			int operNumM=scanner.nextInt();
			Student[] stuArr=new Student[studentNumN];
			for(int i=0;i<studentNumN;i++)
			{
				stuArr[i]=new Student(i+1, scanner.nextInt());
			}
			
			for(int kk=0;kk<operNumM;kk++)
			{
				char op;
				int opNum1,opNum2;
				op=scanner.next().charAt(0);
				opNum1=scanner.nextInt();
				opNum2=scanner.nextInt();
				if(op=='Q')
				{
					if(opNum2<opNum1)
					{
						int temp=opNum1;
						opNum1=opNum2;
						opNum2=temp;
					}
				
					
					int max=myFindMax(stuArr,opNum1-1,opNum2-1);
					
					System.out.println(max);
				}
				else
				{
					stuArr[opNum1-1].score=opNum2;
				}
			}
		}//end while
	}

	private static int myFindMax(Student[] stuArr, int opNum1, int opNum2)
	{
		int max=Integer.MIN_VALUE;
		
		for(int i=opNum1;i<=opNum2;i++)
		{
			if(stuArr[i].score>max)
			{
				max=stuArr[i].score;
			}
		}
		return max;
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
