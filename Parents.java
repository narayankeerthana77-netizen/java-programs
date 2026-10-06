package kee.ram;

 class Parent {
	 private int a;
		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a = a;
		}
	}
	class Parents extends Parent
	{
		public static void main(String[] args) {
			Parents bb = new Parents();		
	   bb.setA(8);
	 int ss=  bb.getA();
	 System.out.println(ss);
		}
	}
 
	