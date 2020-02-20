package house_construction;

import java.util.Scanner;

public class total_cost {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Select material Type");
	System.out.println("Standard materials : SM");
	System.out.println("above Standard materials : ASM");
	System.out.println("high standard materialn : HSM");
	System.out.println("fully automated home : FAH");
	System.out.println();
	String materialType=sc.nextLine();
	int area=sc.nextInt();
	calculate_cost cc=new calculate_cost();
	cc.calculate(materialType,area);
	sc.close();
}
}
