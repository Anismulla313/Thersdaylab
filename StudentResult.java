package tursday_practice;
abstract class Marks {
	abstract float getPercentage();
}

class A extends Marks {
	private byte physics;
	private byte chemistry;
	private byte mathematics;

	public A(byte physics, byte chemistry, byte mathematics) {
		this.physics = physics;
		this.chemistry = chemistry;
		this.mathematics = mathematics;
	}

	public A(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}

	float getPercentage() {
		float result = (float)(physics + chemistry + mathematics)/300*100;
		return result;
	}

}

class B extends Marks {
	private byte physics;
	private byte chemistry;
	private byte mathematics;
	private byte biology;

	public B(byte physics, byte chemistry, byte mathematics, byte biology) {
		this.physics = physics;
		this.chemistry = chemistry;
		this.mathematics = mathematics;
		this.biology = biology;
	}

	public B(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}

	float getPercentage() {
		float result = (float)(physics + chemistry + mathematics + biology)/400*100;
		return result;
	}




	}


 class StudentResult {
	 public static void main(String[] args) {
	A a = new A(66,98,70);
	
	B b = new B(67,80,80);
	
	System.out.println("Student A Result");
	System.out.println("Total Percentage: " + String.format("%.2f", a.getPercentage()) + "%");
	
	
	System.out.println("Student B Result");
	System.out.println("Total Percentage: " + String.format("%.2f", b.getPercentage()) + "%");


	

	}

}
