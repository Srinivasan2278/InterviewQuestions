package homework;

public class add_oddnumbers {

	public static void main(String[] args) {
		int num [] = {20,40,55,25};
		int sumodd = 0;
		int sumeven = 0;
		for(int i = 0; i<num.length ; i++)
		{
		if(i%2==0)
		{
			sumeven = sumeven+ num[i];
		}
		else
		{
			sumodd = sumodd+num[i];
		}
		}
		 
		
		System.out.println("sum of even numbers"+sumeven);
		System.out.println("sum of odd numbers"+sumodd);
		
		/*if(sumeven>sumodd)
		{
			System.out.println("even number is greater");
		}
		else
		{
			System.out.println("odd number is greater");
	
		}*/
	}
}


	
	
		