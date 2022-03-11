package Cloning;

public class TestStudent {
	
public static void main(String[] args) throws CloneNotSupportedException {
		
		Address add = new Address("Pune","Maharashtra",411015);
		
		System.out.println("By Creating new obj:");
		Student s1 = new Student(10,"Ram",add);
		System.out.println("Original:"+s1);
		
		System.out.println("By Using Clone method:");
		Student s2= (Student)s1.clone();
		System.out.println("Cloned:"+s2);
		
		s1.name="Shaam";
		s1.address.city="mumbai";
		s1.address.pinCode=400706;
		s2.rollNo=20;
		System.out.println("After changing the fields");
		System.out.println("Orignal:"+s1);
		System.out.println("Cloned:"+s2);
			
	}


}
