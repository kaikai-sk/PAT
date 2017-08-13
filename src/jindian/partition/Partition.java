package jindian.partition;
import java.util.*;


class ListNode 
{
    int val;
    ListNode next = null;

    ListNode(int val)
    {
        this.val = val;
    }
}


public class Partition 
{
	ListNode first;
	
	public void displayList()
	{
		ListNode curr=first;
		while(curr!=null)
		{
			System.out.print(curr.val+" ");
			curr=curr.next;
		}
		System.out.println();
	}
	
	public void add(ListNode node)
	{
		ListNode curr=first;
		if(first==null)
		{
			first=node;
			return;
		}
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=node;
	}
	
	public void myPartition(int x)
	{
		first=partition(first, x);
		displayList();
	}
	
    public ListNode partition(ListNode pHead, int x) {
		ListNode beforeStart=null;
        ListNode beforeEnd=null;
        ListNode afterStart=null;
        ListNode afterEnd=null;
        
        while(pHead!=null){
            ListNode next=pHead.next;
            pHead.next=null;
            if(pHead.val<x)
            {
            	if(beforeStart==null)
               	{
                	beforeStart=pHead;
                    beforeEnd=pHead;
                }
                else
                {
                	beforeEnd.next=pHead;
                    beforeEnd=pHead;
                }
            }
            else
            {
            	if(afterStart==null)
                {
                    afterStart=pHead;
                    afterEnd=afterStart;
                }
                else
                {
                    afterEnd.next=pHead;
                    afterEnd=pHead;
                    
                }
            }
            pHead = next;
        }
        if(beforeStart==null)
        {
        	return afterStart;    
        }
        beforeEnd.next=afterStart;
        return beforeStart;
    }
}