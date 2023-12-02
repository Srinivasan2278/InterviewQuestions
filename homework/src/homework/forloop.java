package homework;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n [] = {5,9,90,3,4,8,78};
		System.out.println("even numbers");
		for(int i= 0; i<n.length; i++)
		{
			if(n[i]%2==0){
				System.out.println(n[i] + " even numbers");
			}
			
			else
			{
			
					System.out.println(n[i]+ " odd numbers");
			}
			}
	}}