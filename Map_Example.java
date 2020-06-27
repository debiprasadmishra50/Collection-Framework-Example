package collection_framework;

import java.util.HashMap;
import java.util.Map;

public class Map_Example 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(1);
		Employee e2 = new Employee(1);
		Map<Employee , String> map = new HashMap<Employee, String>();
		map.put(e1, "Debi");
		map.put(e2, "Debi");
		System.out.println(e1.equals(e2));
		System.out.println(map.size());
		System.out.println(map);
		
		Integer a = new Integer(1);
		Integer b = new Integer(1);
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(a.equals(b));
		Map<Integer , String> map1 = new HashMap<Integer, String>();
		map1.put(a, "abc");
		map1.put(b, "abc");
		System.out.println(map1.size());
		System.out.println(map1);
	}
}
class Employee
{
	int id;
	public Employee(int id)
	{
		this.id = id;
	}
}

/*
package collection_framework;

import java.util.HashMap;
import java.util.Map;

public class Rough 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Debi");
		map.put(2, "Debi");
		map.put(1, "Debi Prasad");
		
		System.out.println(map);
		System.out.println(map.size());
	}
}

*/
