package homework;

public class add_succesive {

	public static void main(String[] args) {
	
// int a [] ={2,4,5,8,0,10};   output [6,9,13,8,10,0]
		int a [] = {2,4,5,8,0,10};
		int n = a.length;
		
		arraysum(a,n);
	}
	 static void arraysum(int a[], int n)
	    {
	        int sum ;
	        for (int i = 0; i + 1 < n; i++) 
	        {
	            // adding the alternate numbers
	            sum = a[i] + a[i + 1];
	            System.out.print(sum + "  ");
	        }
	
}}
