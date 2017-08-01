package PublicBikeManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int cmax=scanner.nextInt();
		int vertexNum=scanner.nextInt();
		int endIndex=scanner.nextInt();
		int edgeNum=scanner.nextInt();
		
		Graph theGraph=new Graph();
		
		for(int i=1;i<=vertexNum;i++)
		{
			theGraph.addVertex(i, scanner.nextInt());
		}
		for(int i=0;i<edgeNum;i++)
		{
			theGraph.addEdge(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
		}
		
		theGraph.printAdjMat();
		
		Integer resultTime=new Integer(Integer.MAX_VALUE),resultInBikes=new Integer(Integer.MAX_VALUE),resultOutBikes=new Integer(Integer.MAX_VALUE);
		ArrayList<Integer>resultPath=new ArrayList<Integer>();
		theGraph.dfs(resultTime, resultInBikes, resultOutBikes, resultPath, endIndex, cmax);
		
		System.out.print(resultOutBikes+" ");
		for (int i = 0; i < resultPath.size()-1; i++)
		{
			System.out.print(theGraph.vertexList[resultPath.get(i)].label+"->");
		}
		System.out.print(theGraph.vertexList[resultPath.get(resultPath.size()-1)].label+" ");
		System.out.println(resultInBikes+"");
	}
}

class Graph
{
	private int Max_Size=500;
	public Vertex[] vertexList;
	private int[][] adjMat;
	private int nVerts;
	private StackX theStack;
	
	public void printAdjMat()
	{
		for(int i=0;i<nVerts;i++)
		{
			for(int j=0;j<nVerts;j++)
			{
				System.out.print(adjMat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void dfs(Integer resultTime,Integer resultInBikes,Integer resultOutBikes,
			ArrayList<Integer> resultPath,int end,int cmax)
	{
		int costTime=0,inBikes,outBikes;
		ArrayList<Integer> path=new ArrayList<Integer>();
		
		vertexList[0].wasVisited=true;
		theStack.push(0);
		path.add(0);
		
		while(!theStack.isEmpty())
		{
			int v=getAdjUnvisitedVertex(theStack.peak());
			if(v==end || v==-1)
			{
				if(v==end)
				{
					//theStack.push(v);
					path.add(v);
					vertexList[v].wasVisited=true;
					//计算这条路上带去的车和带回的车
					inBikes=0;
					outBikes=0;
					for(int i=1;i<path.size();i++)
					{
						//带走车的情况
						if(vertexList[path.get(i)].bikes>cmax/2)
						{
							inBikes+=vertexList[path.get(i)].bikes-cmax/2;
						}
						else //需要补充车的情况
						{
							//可以内部消化
							if(cmax/2-vertexList[path.get(i)].bikes<inBikes)
							{
								inBikes-=(cmax/2-vertexList[path.get(i)].bikes);
							}
							else //需要从PBMC带来的车
							{
								outBikes+=cmax/2-vertexList[path.get(i)].bikes-inBikes;
								inBikes=0;
							}
						}
						
						
					}
					//判断这条路是否更好
					if(costTime<resultTime)
					{
						resultTime=costTime;
						resultPath=path;
						resultInBikes=inBikes;
						resultOutBikes=outBikes;
					}
					else if(outBikes<resultOutBikes)
					{
						resultPath=path;
						resultInBikes=inBikes;
						resultOutBikes=outBikes;
					}
					else if(inBikes<resultInBikes)
					{
						resultPath=path;
						resultInBikes=inBikes;
						resultOutBikes=outBikes;
					}
					path.clear();
				}
				theStack.pop();
			}
			else
			{
				vertexList[v].wasVisited=true;
				costTime+=adjMat[theStack.peak()][v];
				theStack.push(v);
				path.add(v);
			}
		}
		
		for(int i=0;i<nVerts;i++)
		{
			vertexList[i].wasVisited=false;
		}
	}
	
	private int getAdjUnvisitedVertex(int v)
	{
		for(int j=0;j<nVerts;j++)
		{
			if(vertexList[j].wasVisited==false && adjMat[v][j]!=0)
			{
				return j;
			}
		}
		return -1;
	}

	public void addEdge(int start,int end,int weight)
	{
		adjMat[start][end]=weight;
		adjMat[end][start]=weight;
	}
	
	public void addVertex(int lab,int bikes)
	{
		vertexList[nVerts++]=new Vertex(lab,bikes);
	}
	
	public void displayVertex(int v)
	{
		System.out.print(vertexList[v].label+"");
	}
	
	public Graph()
	{
		vertexList=new Vertex[Max_Size];
		adjMat=new int[Max_Size][Max_Size];
		for(int i=0;i<Max_Size;i++)
		{
			for(int j=0;j<Max_Size;j++)
			{
				adjMat[i][j]=0;
			}
		}
		nVerts=0;
		theStack=new StackX();
		
		//添加PBMC
		addVertex(0, 0);
	}
}

class Vertex
{
	public int label;
	public int bikes;
	public boolean wasVisited;
	public Vertex(int lab,int bikes)
	{
		this.label=lab;
		this.bikes=bikes;
		wasVisited=false;
	}
}

class StackX
{
	private int MAX_SIZE=500;
	private int top;
	private int[] st;
	
	public StackX()
	{
		st=new int[MAX_SIZE];
		top=-1;
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public void push(int v)
	{
		st[++top]=v;
	}
	
	public int pop()
	{
		return st[top--];
	}
	
	public int peak()
	{
		return st[top];
	}
}