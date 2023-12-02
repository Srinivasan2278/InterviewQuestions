package homework;

public class CONSECUTIVE {

		public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int b[] = new int[a.length];
		for(int i=0;i<a.length-1;i++) {
			b[i]=a[i]+a[i+1];
		//	System.out.print(b[i]+" ");
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(b[i]+" ");
			
		}

	}
	   

	  

	    
}
