package copyconstructor;

public class TestEmployee {
	
	public static void main(String[] args) {
		Address add = new Address("pune","Maharashtra",411015);
		Employee e1 = new Employee(1,"Ram",add);
		System.out.println("Original:"+e1);
		Employee e2 = new Employee(e1);
		System.out.println("Cloned:"+e2);
		e1.name="Shaam";
		e2.address.city="Mumbai";
		e2.address.pinCode=400706;
		System.out.println("After changing fields");
		System.out.println("Original:"+e1);
		System.out.println("Cloned:"+e2);
	}
}
