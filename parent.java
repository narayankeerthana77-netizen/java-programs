package kee.ram;
//class and object
// variable method constructor and block
 class parenta {
	void property() {
		System.out.println("Property");
	}
	void marry() {
		System.out.println("family selection");
	}
}
public class parent extends parenta {
	void marry() {
		System.out.println(" campus selection");
	}
	public static void main(String[]args) {
		parent bb = new parent();
		bb.marry();
		bb.property();
	}
}
