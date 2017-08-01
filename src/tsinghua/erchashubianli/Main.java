package tsinghua.erchashubianli;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext())
		{
			String string=scanner.next();
			Node root=rebuildTree(string);
			LNRTranversal(root);
			System.out.println();
		}
		scanner.close();
	}

	/**
	 * 二叉树的 中序遍历，递归实现
	 * @param root  树根
	 */
	private static void LNRTranversal(Node root)
	{
		if(root==null)
			return;
		LNRTranversal(root.leftChild);
		System.out.print(root.value+" ");
		LNRTranversal(root.rightChild);
		
	}

	/**
	 * 根据先根遍历构建二叉树
	 * @param string 先序遍历的字符串
	 * @return 构建好的二叉树
	 */
	private static Node rebuildTree(String string)
	{
		//模拟指针，递归过程中都是对index[0]进行修改的
		int[] index=new int[]{0};
		
		return createNLRTree(string,index);
	}

	private static Node createNLRTree(String string, int[] index)
	{
		char ch=string.charAt(index[0]);
		if(ch=='#')
			return null;
		else
		{
			Node root=new Node(ch);
			++index[0];
			root.leftChild=createNLRTree(string, index);
			++index[0];
			root.rightChild=createNLRTree(string, index);
			return root;
		}
	}
}

class Node
{
	public char value;
	public Node leftChild;
	public Node rightChild;
	
	public Node(char value)
	{
		this.value=value;
		leftChild=null;
		rightChild=null;
	}
}
