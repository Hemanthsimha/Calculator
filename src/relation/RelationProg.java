package relation;

import java.util.Scanner;

public class RelationProg 
{
	
	public static void comparision()
	{
		Scanner sc = null;
		sc = new Scanner(System.in);
		
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	if (a==b) 
	{
		System.out.println("The Given two numbers are equal");
	}
	else if(a<b)
	{
		System.out.println("The"+a+"is smaller than"+b);
	}
	else
	{
		System.out.println("The"+a+"is greater than"+b);
	}
	
	if (sc!=null) 
	{
	sc.close();	
	}
		
	}
	public static void main(String[] args) 
	{
	
		System.out.println("Comparision of two integers Program starts...");
		comparision();
		System.out.println("Comparision of two integers Program ends...");
	}

}
