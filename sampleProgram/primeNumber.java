package sampleProgram;

public class primeNumber {
	public static void main(String[] args) {
		int number = 79;
		boolean flag = false;
		for(int i=2; i<=number-1; i++) {
			if(number%i ==0) {
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("Prime Number.");
		}else {
			System.out.println("Not a PrimeNumber.");
		}
		
	}

}
