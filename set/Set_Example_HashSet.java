package collection_framework.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Example_HashSet 
{
	public static void main(String[] args) 
	{
		Set<BankAccount> accounts = new HashSet<BankAccount>();
		accounts.add(new BankAccount(12344, "Debi", 20000));
		accounts.add(new BankAccount(12345, "Debi", 20000));
		accounts.add(new BankAccount(12346, "Debi", 20000));
		accounts.add(new BankAccount(12347, "Debi", 20000));
		accounts.add(new BankAccount(12348, "Debi", 20000));
		accounts.add(new BankAccount(12349, "Debi", 20000));
		
		Iterator<BankAccount> itr = accounts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(accounts.size());
		
	}
}
