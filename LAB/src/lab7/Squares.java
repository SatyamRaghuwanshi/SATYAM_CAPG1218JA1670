package lab7;

import java.util.HashMap;
import java.util.Map;


public class Squares {
	public Map<Integer,Integer> accepts(int a[])
	{
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(!m.containsKey(a[i]))
			{
				m.put(a[i], a[i]*a[i]);
			}
		}
		return m;
	}
	public static void main(String args[])
	{
		Squares Squares=new Squares();
		int a[]= {1,2,25,4};
		System.out.println(Squares.accepts(a));
	}
}

