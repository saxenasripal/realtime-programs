/*
 here you have to give the previous reading and the present reading 
the program will calculate the bill based on the below slabs.


Telangana electricity slab or tariff rates

1. Category 1(between - 0to 100)
0-50 Units - ?1.45 consumer charges 
51-100 units - ? 2.60 consumer charges

2. Category 2(between - 100 to 200)
0-100 Units - ?3.30 consumer charges
101-200 units - ? 4.30 consumer charges

3. Category 3(more than 200 units)
0-200 Units - ?5 consumer charges
201-300 units - ? 7.20 consumer charges
301-400 units - ? 8.50 consumer charges
401-800 units - ? 9 consumer charges
Above 800 Units - ? 9.5 consumer charges*/

import java.util.Scanner;
class ElectricBill
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the previous Reading");
		int prev=sc.nextInt();
		System.out.println("Enter the present Reading");
		int pres=sc.nextInt();
		int units=pres-prev;
		System.out.println("This Month you used"+units+" units");
		double bill=0;
		if (units>0 && units<=100) //Category1 units between 1-100
		{
			if(units<=50)
			{
				bill=units*1.45;
			}
			else
			{
				bill=50*1.45;
				units=units-50;
				bill=bill+(units*2.60);
			}
		}
		else if (units>=100 && units<=200) //Category 2 units between 100 to 200
		{
			bill=100*3.30;
			units=units-100;
			bill=bill+(units*4.30);
		}
		else if (units>200) //Category 3 units above 200
		{
			if(units>=201&&units<=300)
			{
				bill=200*5;
				units=units-200;
				bill=bill+(units*7.20);
			}
			else if(units>=301&&units<=400)
			{
				bill=200*5;
				units=units-200;
				bill=bill+(100*7.20);
				units=units-100;
				bill=bill+(units*8.50);
			}
			else if(units>=401&&units<=800)
			{
				bill=200*5;
				units=units-200;
				bill=bill+(100*7.20);
				units=units-100;
				bill=bill+(100*8.50);
				units=units-100;
				bill=bill+(units*9);
			}
			else if(units>=801)
			{
				bill=200*5;
				units=units-200;
				bill=bill+(100*7.20);
				units=units-100;
				bill=bill+(100*8.50);
				units=units-100;
				bill=bill+(400*9); 
				units=units-400;
				bill=bill+(units*9.5);
			}
		}
		System.out.println("\n\t****SPPS****\n YOUR USING SPPS SERVICES\n");
		System.out.println("Energy Charges:\t\t"+bill);
		System.out.println("Customer Charges:\t"+ 80);
		System.out.println("Energy Charges:\t\t"+ 72);
		System.out.println("TOTAL BILL:\t\t"+ (bill+152));
		System.out.println("\n\nNOTE: PAYMENT AFTER DUE DATE\nATTRACTS    SUBCHARGE    AND \nDISCONNECTION\nE&OE\t\t       EAOERO");
	}
}
