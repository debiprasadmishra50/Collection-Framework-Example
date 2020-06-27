package collection_framework.set;

public class BankAccount implements Comparable<BankAccount>
{
	private long accountId;
	private String name;
	private long accBal;
	public BankAccount(long accountId, String name, long accBal) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.accBal = accBal;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}public long getAccBal() {
		return accBal;
	}
	public void setAccBal(long accBal) {
		this.accBal = accBal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (accountId ^ (accountId >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (accBal != other.accBal)
			return false;
		if (accountId != other.accountId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", name=" + name + ", accBal=" + accBal + "]";
	}
	@Override
	public int compareTo(BankAccount bankAccount) 
	{
		int result = (int) (this.accountId - bankAccount.accountId);
		int res = this.name.compareTo(bankAccount.name);
		return result;
//		return res;
	}
	
	
	
}
