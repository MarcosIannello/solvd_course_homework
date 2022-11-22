import java.util.Arrays;
import java.util.Random;

public class SortingClass {
	public static void main(String[] args){
		
		Random rand = new Random();
		
		int[] numbers = new int[10];
		
		for (int i=0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
		}
		
		System.out.println("Array before being sort: ");
		System.out.println(Arrays.toString(numbers));
		
		//Bubble sort algorithm
		boolean swappedSomething = true;
		
		while(swappedSomething) {
			
			swappedSomething = false;
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i]>numbers[i+1]) {
					int temporalVariable = numbers[i];
					numbers[i] = numbers[i+1];
					numbers[i+1] = temporalVariable;
					swappedSomething = true;
				}
			}
		}
		
		//Organized array
		System.out.println("Array after bubble sort: ");
		System.out.println(Arrays.toString(numbers));
		
		
	}

}
