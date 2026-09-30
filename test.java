//OOps
//inheritance
//polymorphism
//encapulation
//Abstraction

package kee.ram;

public class test {
	void add(String s)
	{
		System.out.println("Method 1");
	}
	void add(int a,int b)
	{
		System.out.println("Method 2");
	}
public static void main(String[]args) {
	test address = new test();
	address.add("Hello");
	address.add(2, 3);
}

}
