import java.util.Scanner;
class Ticket
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Miyapur\n2.JNTU\n3.KPHB\n4.Kukatpally\n5.BalaNagar");
		int boarding=sc.nextInt();
		System.out.println("1.Miyapur\n2.JNTU\n3.KPHB\n4.Kukatpally\n5.BalaNagar");
		int departure=sc.nextInt();
		int km=0;
		int bill=0;
		for (int i=boarding;i<departure ;i++ )
		{
			km=km+2;
		}
		System.out.println(km);
		if(km>=0&&km<2)
		{
			bill=10;
		}
		else if (km>=2&&km<4)
		{
			bill=15;
		}
		else if (km>=4&&km<6)
		{
			bill=25;
		}
		else if (km>=6&&km<8)
		{
			bill=30;
		}
		else if (km>=8&&km<=10)
		{
			bill=35;
		}
		System.out.println(bill);
	}
}
