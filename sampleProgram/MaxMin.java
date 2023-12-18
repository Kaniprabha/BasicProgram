package sampleProgram;

public class MaxMin {
	public static void main(String[] args) {
		double[] numArray = {49, 70.15, 100, 55.99, -200, 500, 48};
		double largest = numArray[0];
		for(double num : numArray) {
			if(largest<num) {
				largest = num;
			}
		}
		System.out.println("Maximum: "+largest);
		for(double min : numArray) {
			if(largest>min) {
				largest = min;
			}
		}
		System.out.println("Minimum: "+largest);
	}

}
