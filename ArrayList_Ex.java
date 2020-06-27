package collection_framework;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Ex 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(60);
		list.add(50);
		list.add(30);
		
		System.out.println(list);
//		Iterator<Integer> itr = list.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		list.remove(1);
		System.out.println(list);
		
	}
}

