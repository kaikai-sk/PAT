package basic.xiexing;

import java.util.*;

public class ChkBloodType
{
	public String[] chkBlood(String father, String mother)
	{
		HashMap<String, String[]> map=new HashMap<String, String[]>();
		map.put("OO", new String[]{"O"});
		map.put("AO", new String[]{"A","O"});
		map.put("AA", new String[] { "A", "O" });
		map.put("AB", new String[] { "A", "AB", "B", "O" });
		map.put("AAB", new String[] { "A", "AB", "B" });
		map.put("BO", new String[] { "B", "O" });
		map.put("BB", new String[] { "B", "O" });
		map.put("BAB", new String[] { "A", "AB", "B" });
		map.put("ABO", new String[] { "A", "B" });
		map.put("ABAB", new String[] {"A", "AB", "B"  });
		if(map.get(father+mother)!=null)
		{
			return map.get(father+mother);
		}
		else if(map.get(mother+father)!=null)
		{
			return map.get(mother+father);
		}
		else 
		{
			return null;
		}
	}
}