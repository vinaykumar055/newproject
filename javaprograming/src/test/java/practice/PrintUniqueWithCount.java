package practice;

import java.util.TreeMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class PrintUniqueWithCount {
	@Test
public void unique()
{
	int [] a= {4,3,2,3,1};
	TreeMap<Integer,Integer> ts=new TreeMap<Integer,Integer>();
for(int i=0;i<a.length;i++)
{
	if(!ts.containsKey(a[i]))
	{
		ts.put(a[i],1);
	}
	else
	{
		int x=ts.get(a[i]);
		x++;
		ts.put(a[i], x);
	}
}

for(Entry<Integer, Integer> ab:ts.entrySet())
{
	if(ab.getValue()==1)
	{
		System.out.println(ab.getKey()+"  count  "+ab.getValue());
	}
}
}}
