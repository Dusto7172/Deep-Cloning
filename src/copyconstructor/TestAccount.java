package copyconstructor;

public class TestAccount {
	
public static void main(String[] args) {
		
		Bank b1 = new Bank("BOI","Pune",4876);
		Account acc1 = new Account(95478624,"Ben",b1);
		System.out.println("Original:"+acc1);
		Account acc2 = new Account(acc1);
		System.out.println("Cloned:"+acc2);
		acc1.name="Kevin";
		acc1.details.branchCode=8563;
		System.out.println("After Changing Fields");
		System.out.println("Original:"+acc1);
		System.out.println("Cloned:"+acc2);
	
	}
}
