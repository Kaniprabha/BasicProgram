package sampleProgram;

public class EvenOdd {
	public void method(int num1) {
		if(num1%2 ==0) {
			System.out.println("Given Number is Even.");
		}
		else {
			System.out.println("Given Number is Odd.");
		}
	}
	public static void main(String[] args) {
		EvenOdd obj = new EvenOdd();
		obj.method(56);
	}

}
