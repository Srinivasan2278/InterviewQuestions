package homework;

public class add {
	public static void main(String[] args) {
	int a [] = {1,2,3,4,5,6,7};
	int n = a.length;
	arraysum(a,n);
	}
	
static void arraysum(int a[],int n) {
	int sum;
	for(int i =0; i<n&&i+1<n;i++)
	{
		sum= a[i]*a[i+1];
		System.out.println(sum+"  ");
	}
}}


