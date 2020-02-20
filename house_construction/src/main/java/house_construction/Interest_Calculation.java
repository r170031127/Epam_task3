package house_construction;

import java.util.Scanner;

public class Interest_Calculation {
	public static void main(String [] args)
	{
		Scanner scanner=new Scanner(System.in);
		int principle_amount=scanner.nextInt();
		int time=scanner.nextInt();
		int rate_of_interest=scanner.nextInt();
		Simple_interest s=new Simple_interest();
		Compound_interest c=new Compound_interest();
		System.out.println("Simple Interest : "+s.simple(principle_amount,time,rate_of_interest));
		System.out.println("Compound Interest : "+c.compound(principle_amount,time,rate_of_interest));
		
		
	}
}
