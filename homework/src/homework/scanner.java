package homework;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your first name");
		String firstname = sc.nextLine();
		System.out.println("enter your last name");
		String lastname = sc.nextLine();
		System.out.println("entered first name is"+" "+firstname);
		System.out.println("entered last name is"+" "+lastname);
		System.out.println("full name is "+" "+firstname+" "+lastname);
	}

}
