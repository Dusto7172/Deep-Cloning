package Cloning;

public class Student implements Cloneable {
	int rollNo;
	String name;
	Address address;
	
	public Student() {
		super();
	}

	public Student(int rollNo, String name, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student dummyStd = (Student)super.clone();
		Address addr = (Address)address.clone();
		dummyStd.address=addr;
		return dummyStd;
	}

}
