package collection_framework;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Deque_Ex 
{
	public static void main(String[] args) 
	{
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		System.out.println(q);
		q.remove();
		System.out.println(q);
		
		Deque<Integer> dq = new LinkedList<Integer>();
		dq.add(10);
		dq.add(20);
		dq.add(30);
		dq.add(40);
		dq.add(50);
		System.out.println(dq);
		dq.remove();
		System.out.println(dq);
		dq.removeFirst();
		System.out.println(dq);
		dq.removeLast();
		System.out.println(dq);
	}
}
