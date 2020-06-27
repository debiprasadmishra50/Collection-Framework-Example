package collection_framework;
import java.util.Stack;

public class Stack_Ex 
{
	public static void main(String[] args) 
	{
		Stack<Integer> st = new Stack<Integer>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(10);
		st.push(40);
		st.push(50);
		
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.search(10));
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.empty());
		System.out.println(st.size());
		st.clear();
		System.out.println(st);
	}
}
