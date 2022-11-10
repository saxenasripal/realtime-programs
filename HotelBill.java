/*here you have to select the tiffin and how many plates you want.
and then just follow the istructions. and this programs will give you the total bill*/

import java.util.Scanner;
class HotelBill 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int idly =30;
		int dosa =40;
		int bonda =35;
        int wada =25;
		int puri =35;
		int bill=0;
		int plate;
		System.out.println("Welcome to shah tiffin center");
		System.out.println("sir do you want water bottle");
		System.out.println("1. Yes\n2. No");
		int a=sc.nextInt();
		if (a==1)
		{		
			bill=bill+20;
		}
		else
		{
			bill=bill+0;
		}


		for (int i=0;i!=6 ; )
		{
			System.out.println("1. idly\n2. dosa\n3. bonda\n4. wada\n5. puri\n6. Exit");
			int op=sc.nextInt();
		if ( op == 1)
		{
			System.out.println("Enter the number of plates");
			plate=sc.nextInt();
			bill=bill+(idly*plate);
			System.out.println("Bill as of now"+bill);
		}
		else if ( op == 2)
		{
			System.out.println("Enter the number of plates");
			plate=sc.nextInt();
			bill=bill+(dosa*plate);
			System.out.println("Bill as of now"+bill);
		}
		else if ( op == 3)
		{
			System.out.println("Enter the number of plates");
			plate=sc.nextInt();
			bill=bill+(bonda*plate);
			System.out.println("Bill as of now"+bill);
		}
		else if ( op == 4)
		{
			System.out.println("Enter the number of plates");
			plate=sc.nextInt();
			bill=bill+(wada*plate);
			System.out.println("Bill as of now"+bill);
		}
		else if ( op == 5)
		{
			System.out.println("Enter the number of plates");
			plate=sc.nextInt();
			bill=bill+(puri*plate);
			System.out.println("Bill as of now"+bill);
		}
		else if ( op == 6)
		{
			i=6;
		}
				
	}
	System.out.println("The total bill is "+bill);
	System.out.println("****THANKS FOR VISITING SHAH TIFFIN CENTER****");
}
}
