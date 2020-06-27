package collection_framework;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_Ex 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList<>();
		System.out.println(list);
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(60);
		list.add(50);
		list.add(40);
		
		System.out.println(list); //traversing by println()
		
		for (Integer integer : list) //traversing by foreach
			System.out.print(integer+"\t");
		
		System.out.println("\n"+list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.get(3));
		
		Collections.sort(list);
		System.out.println("After sort "+list);
		Collections.reverse(list);
		System.out.println("After Reverse "+list);
		
		System.out.println(list.contains(40));
		System.out.println(list.indexOf(60));
		System.out.println(list.lastIndexOf(40));
		System.out.println(list.size());
		System.out.println(list.hashCode());
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		System.out.println(list1);
		
		list.addAll(list1);
		System.out.println(list);
//		list1.addAll(list);
//		System.out.println(list1);
		
		list.addAll(2, list1);
		System.out.println(list);
		
		list.removeAll(list1);
		System.out.println(list);
		list.remove();
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		
		Object[] array = list.toArray();
		for (Object object : array) 
			System.out.print(object+"\t");
		
		System.out.println();
		
		String string = list.toString();
		System.out.println(string);
	}
}
