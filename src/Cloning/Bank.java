package Cloning;

public class Bank implements Cloneable{
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
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", branch=" + branch + ", branchCode=" + branchCode + "]";
	}
	
	

}
