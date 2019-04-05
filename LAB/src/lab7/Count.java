package lab7;

import java.util.HashMap;
import java.util.Map;




public class Count {
	public Map<String,Integer> countCharacter(char[] a)
	{
		Map<String,Integer> m=new HashMap<String,Integer>();
		for(int i=0;i<a.length;i++)
		{
			String str=""+a[i];
			if(m.containsKey(str))
			{
				int temp=m.get(str);
				m.put(str, temp+1);
			}
			else
			{
				m.put(str,1);
			}
		}
		return m;
	}
	public static void main(String args[])
	{
		char c[]={'s','b','d','a','a','a'};
		Count Count=new Count();
		System.out.println(Count.countCharacter(c));
	}
}
