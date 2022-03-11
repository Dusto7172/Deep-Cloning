package copyconstructor;

public class Bank{
	String bankName;
	String branch;
	int branchCode;
	
	public Bank() {
		super();
	}

	public Bank(String bankName, String branch, int branchCode) {
		super();
		this.bankName = bankName;
		this.branch = branch;
		this.branchCode = branchCode;
	}
	
	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", branch=" + branch + ", branchCode=" + branchCode + "]";
	}
	
	

}
