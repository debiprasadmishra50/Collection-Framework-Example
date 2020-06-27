package collection_framework.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
class SavingsAccountOrderByAccountIdAsc implements Comparator<BankAccount>
{
	@Override
	public int compare(BankAccount account1, BankAccount account2) 
	{
		return (int) (account1.getAccountId() - account2.getAccountId());
//		return Long.valueOf(account1.getAccountId()).compareTo(account2.getAccountId());
	}
}
class SavingsAccountOrderByAccountIdDsc implements Comparator<BankAccount>
{
	@Override
	public int compare(BankAccount account1, BankAccount account2) 
	{
		return (int) (account2.getAccountId() - account1.getAccountId());
//		return Long.valueOf(account1.getAccountId()).compareTo(account2.getAccountId());
	}
}
class SavingsAccountOrderByAccountBalanceAsc implements Comparator<BankAccount>
{
	@Override
	public int compare(BankAccount account1, BankAccount account2) 
	{
		return (int) (account1.getAccBal() - account2.getAccBal());
//		return Long.valueOf(account1.getAccountId()).compareTo(account2.getAccountId());
	}
}
class SavingsAccountOrderByAccountBalanceDsc implements Comparator<BankAccount>
{
	@Override
	public int compare(BankAccount account1, BankAccount account2) 
	{
		return (int) (account2.getAccBal() - account1.getAccBal());
//		return Long.valueOf(account1.getAccountId()).compareTo(account2.getAccountId());
	}
}
public class Set_Example_TreeSet 
{
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	public static void main(String[] args) 
	{
//		Comparator<BankAccount> savingsAccountOrderByAccountBalanceDsc = (account1 , account2) -> (int) account2.getAccBal().compareTo(account1.getAccBal());
		
//		Comparator<BankAccount> savingsAccountOrderByAccountBalanceDsc = new Comparator<BankAccount>() {
//			@Override
//			public int compare(BankAccount account1, BankAccount account2) 
//			{
//				return (int) (account2.getAccBal() - account1.getAccBal());
//			}
//			
//		};
		
		Comparator<BankAccount> savingsAccountOrderByAccountBalanceDsc =(account1 , account2) -> (int)(account2.getAccBal() - account1.getAccBal());

		
		System.out.println("Please enter on which basis you want to arrange the data \n1. Account Id \n2. Account Balance");
		int input = sc.nextInt();
		switch (input) 
		{
		case 1: 
		{
			System.out.println("Please enter if you want the result in Ascending or in Descending Way \n1. Ascending \n2. Descending");
			int value = sc.nextInt();
			switch (value) 
			{
			case 1: 
			{
				Comparator<BankAccount> criteria = new SavingsAccountOrderByAccountIdAsc();
				Set<BankAccount> accounts = new TreeSet<BankAccount>(criteria);
				Set_Example_TreeSet.operation(accounts);
				break;
			}
			case 2:
			{
				Comparator<BankAccount> criteria = new SavingsAccountOrderByAccountIdDsc();
				Set<BankAccount> accounts = new TreeSet<BankAccount>(criteria);
				Set_Example_TreeSet.operation(accounts);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + input);
			}
			break;
		}
		case 2: 
		{
			System.out.println("Please enter if you want the result in Ascending or in Descending Way \n1. Ascending \n2. Descending");
			int value = sc.nextInt();
			switch (value) 
			{
			case 1: 
			{
				Comparator<BankAccount> criteria = new SavingsAccountOrderByAccountBalanceAsc();
				Set<BankAccount> accounts = new TreeSet<BankAccount>(criteria);
				Set_Example_TreeSet.operation(accounts);
				break;
			}
			case 2:
			{
				Comparator<BankAccount> criteria = new SavingsAccountOrderByAccountBalanceDsc();
				Set<BankAccount> accounts = new TreeSet<BankAccount>(criteria);
				Set_Example_TreeSet.operation(accounts);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + input);
			}
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}
		
//		Comparator<BankAccount> criteria = new SavingsAccountOrderByAccountBalanceDsc();
//		Set<BankAccount> accounts = new TreeSet<BankAccount>(criteria);
//		Set<BankAccount> accounts = new TreeSet<BankAccount>(new SavingsAccountOrderByAccountIdAsc());
//		accounts.add(new BankAccount(12344, "Debi", 20000));
//		accounts.add(new BankAccount(12344, "Raja", 10000)); // will not get added as Set doesn't allow duplicates
//		accounts.add(new BankAccount(12345, "Hari", 25401));
//		accounts.add(new BankAccount(12346, "Hihi", 15454));
//		accounts.add(new BankAccount(12347, "Rani", 32135));
//		accounts.add(new BankAccount(12348, "Kani", 54156));
//		accounts.add(new BankAccount(12349, "Mani", 14541));
//		
//		Iterator<BankAccount> itr = accounts.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//		System.out.println(accounts.size());
	}
	public static void operation(Set<BankAccount> accounts)
	{
		accounts.add(new BankAccount(12344, "Debi", 20000));
		accounts.add(new BankAccount(12344, "Raja", 10000)); // will not get added as Set doesn't allow duplicates
		accounts.add(new BankAccount(12345, "Hari", 25401));
		accounts.add(new BankAccount(12346, "Hihi", 15454));
		accounts.add(new BankAccount(12347, "Rani", 32135));
		accounts.add(new BankAccount(12348, "Kani", 54156));
		accounts.add(new BankAccount(12349, "Mani", 14541));
		
		Iterator<BankAccount> itr = accounts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(accounts.size());
	}
}


/*
 * Lambda Expression Example
 * -------------------------------
 * // Moreover Lambda expresson is replacement of Anonymous Class in Java
interface A
{
	void show();
}
interface B //extends A
{
	// void show();
	void multiply(int a , int b);
}
class Test 
{
	// public void show()
	// {
	// 	System.out.println("show() in Test");
	// }
	public static void main(String[] args) 
	{
		// A a = new A(){
		// 	public void show()
		// 	{
		// 		System.out.println("show in Test$1");
		// 	}
		// };
		// a.show();
		// new Test().show();
		A x = () -> System.out.println("show using Lambda");
		x.show();

		
		B mul = (a , b) -> System.out.println(a*b); 
		mul.multiply(10 , 20);
	}
}
 */
