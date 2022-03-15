package pack123;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class General {
	
	
	public static void main(String[] args) {
		
		         // Key, Value
		Hashtable<Integer,String> t = new Hashtable<Integer,String>();
		
		t.put(85, "Velocity");
		t.put(45, "Class");
		t.put(95, "Batch");
		t.put(22, "2021");
		t.put(64, "Velocity");
		
		for(Map.Entry<Integer,String> e : t.entrySet() )
		{
			System.out.println("Key= " + e.getKey()  + " Value= " + e.getValue());
		}
		
		t.put(95, "Katraj");
		
		System.out.println("======================");
		
		for(Map.Entry<Integer,String> e : t.entrySet() )
		{
			System.out.println("Key= " + e.getKey()  + " Value= " + e.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		HashMap<Integer,String> h = new HashMap<Integer,String>();
//		
//		h.put(null, "Velocity");
//		h.put(45, "Class");
//		h.put(95, null);
//		h.put(22, "2021");
//		h.put(64, null);
//		
//		for(Map.Entry<Integer,String> e : h.entrySet() )
//		{
//			System.out.println("Key= " + e.getKey()  + " Value= " + e.getValue());
//		}
//		
//		h.put(null, "Katraj");
//		
//		System.out.println("======================");
//		
//		for(Map.Entry<Integer,String> e : h.entrySet() )
//		{
//			System.out.println("Key= " + e.getKey()  + " Value= " + e.getValue());
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		HashSet<Integer> h = new HashSet<Integer>();
//		
//		h.add(856);
//		h.add(745);
//		h.add(843);
//		h.add(25);
//		h.add(856);
//		h.add(25);
//		h.add(856);
//		
//		Iterator<Integer> i = h.iterator();
//		
//		for(int a : h)
//		{
//			System.out.println(i.next());
//		}
//		
//		System.out.println("--------");
//		
//		i = h.iterator();
//		
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		
		
		
		
		
		
		
		
		
		
//		ArrayList<String> a = new ArrayList<String>();
//		
//		a.add("Velocity");
//		a.add("Class");
//		a.add("Velocity");
//		a.add("Batch");
//		a.add("2022");
//		
//		for(int i = 0; i <a.size() ; i++)
//		{
//			System.out.println(a.get(i));
//		}
//		
//		a.remove(2);
//		
//		System.out.println("----------------");
//		for(int i = 0; i <a.size() ; i++)
//		{
//			System.out.println(a.get(i));
//		}
		
		
		
	}

}
