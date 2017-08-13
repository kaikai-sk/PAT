package jindian.partition;

import static org.junit.Assert.*;

import org.junit.Test;

public class PartitionTest
{

	@Test
	public void test()
	{
		Partition p=new Partition();
		p.add(new ListNode(6));
		p.add(new ListNode(2));
		p.add(new ListNode(8));
		p.myPartition(9);
	}

}
