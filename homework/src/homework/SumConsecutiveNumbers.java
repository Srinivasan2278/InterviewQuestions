package homework;

public class SumConsecutiveNumbers {

	
	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5}; // Example array
	        int[] sums = new int[numbers.length]; // Array to store the sums
	        
	        // Iterate through the array
	        for (int i = 0; i < numbers.length -1; i++) {
	            sums[i] = numbers[i] + numbers[i + 1]; // Sum consecutive numbers and store in sums array
	          
	        }
	        
	        // Print the sums array
	        System.out.print("Sum of consecutive numbers: ");
	        for (int i = 0; i < sums.length; i++) {
	            System.out.print(sums[i] + " ");
	        } 
	       
	    }
	}
