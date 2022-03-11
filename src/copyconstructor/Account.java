package copyconstructor;

public class Account {
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
	
	public Account(Account acc) {
		super();
		this.accNo =acc.accNo;
		this.name = acc.name;
		Bank dummyB=new Bank();
		dummyB.bankName=acc.details.bankName;
		dummyB.branch=acc.details.branch;
		dummyB.branchCode=acc.details.branchCode;
		this.details=dummyB;
	}


	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", details=" + details + "]";
	}
	
	}
