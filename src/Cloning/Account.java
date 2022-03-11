package Cloning;

public class Account implements Cloneable {
	int accNo;
	String name;
	Bank details;
	
	public Account() {
		super();
	}

	public Account(int accNo, String name, Bank details) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.details = details;
	}
	
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Account dummyAcc =(Account)super.clone();
		Bank b =(Bank)details.clone();
		dummyAcc.details=b;
		return dummyAcc;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", details=" + details + "]";
	}
	
	}
