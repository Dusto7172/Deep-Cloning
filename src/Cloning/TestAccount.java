package Cloning;

public class TestAccount {
	
public static void main(String[] args) throws CloneNotSupportedException {
		
		Bank b1 = new Bank("Bank of India","Pune",47856);
		Account a1 = new Account(748569412,"Bobby",b1);
		System.out.println("Original:"+a1);	
		Account a2=(Account) a1.clone();
		System.out.println("Cloned:"+a2);
		a1.accNo=5748964;
		a1.details.branchCode=87456;
		System.out.println("After changing the fields");
		System.out.println("Orignal:"+a1);
		System.out.println("Cloned:"+a2);
}
	
}
