package jindian.addAB;
import java.nio.channels.AcceptPendingException;
import java.util.*;


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Plus
{
    public ListNode plusAB(ListNode a, ListNode b)
    {
    	ListNode resultHead=new ListNode(-1);
    	ListNode resultCurrent=resultHead;
    	
    	int carry=0;
    	ListNode aCurrent=a;
    	ListNode bCurrent=b;
    	while(aCurrent!=null || bCurrent!=null || carry!=0)
    	{
    		int aVal=0,bVal=0;
    		if(aCurrent!=null)
    		{
    			aVal=aCurrent.val;
    		}
    		if(bCurrent!=null)
    		{
    			bVal=bCurrent.val;
    		}
    		
    		int sum=aVal+bVal+carry;
    		int nodeDigit=sum%10;
    		carry=sum/10;
    		
    		resultCurrent.next=new ListNode(nodeDigit);
    		resultCurrent=resultCurrent.next;
    		
    		if(aCurrent!=null)
    		{
    			aCurrent=aCurrent.next;
    		}
    		if(bCurrent!=null)
    		{
    			bCurrent=bCurrent.next;
    		}
    	}
    	return resultHead.next;
    }
}