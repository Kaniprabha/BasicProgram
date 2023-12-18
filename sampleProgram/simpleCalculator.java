package sampleProgram;

public class simpleCalculator {
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a, int b) {
		return a/b;
	}
	public int quotient(int a, int b) {
		return a%b;
	}
	
	public static void main(String[] args) {
		simpleCalculator obj = new simpleCalculator();
		System.out.println("Addition: "+obj.add(15, 15));
		System.out.println("Subraction: "+obj.sub(50, 25));
		System.out.println("Multiply: "+obj.mul(10, 10));
		System.out.println("Division: "+obj.div(100, 10));
		
	}

}

