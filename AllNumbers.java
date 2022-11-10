import java.util.Scanner;
class AllNumbers
{
	static void palindrome(int a) //palindrome Number
	{
		int rev=0;
		int n=a;
		while (n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if (rev==a)
		{
			System.out.println("it is a palindrome number");
		}
		else
		{
			System.out.println("it is not a palindrome");
		}
	}
	static void armstrongNumber(int a) //armstrong Number
	{
		int n=a;
		int count=0;
		while (n!=0)
		{
			int rem=n%10;
			count++;
			n=n/10;
		}
		n=a;
		int sum=0;
		while (n!=0)
		{
			int rem=n%10;
			int pow=1;
			int i=1;
			while (i<=count)
			{
				pow=pow*rem;
				i++;
			}
			sum=sum+pow;
			n=n/10;
		}
		if (sum==a)
		{
			System.out.println("It is an armstrong Number");
		}
		else
		{
			System.out.println("It is not an armStrong Number");
		}
	}
	static void strongNumber(int a)
	{
		int n=a;
		int sum=0;
		while (n!=0)
		{
			int rem=n%10;
			int fact=1;
			for (int i=rem;i>=1 ;i-- )
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if (sum==a)
		{
			System.out.println("it is a Strong number");
		}
		else
		{
			System.out.println("it is not a Strong number");
		}
	}
	static void perfectNumbet(int a)
	{
		int n=a;
		int sum=0;
		for (int i=1;i<n ;i++ )
		{
			if (n%i==0)
			{
				sum+=i;
			}
		}
		if (sum==a)
		{
			System.out.println("It is a Perfect Number");
		}
		else
		{
			System.out.println("It is not a perfect Number");
		}
	}
	static void primeNumber(int a)
	{
		int n=a;
		int count=0;
		for (int i=2;i<n ;i++ )
		{
			if (n%i==0)
			{
				count++;
			}
		}
		if (count==0)
		{
			System.out.println("It is prime number");
		}
		else
		{
			System.out.println("It is not a prime number");
		}	
	}
	static void spyNumber(int a)
	{
		int n=a;
		int sum=0,pro=1;
		while (n!=0)
		{
			int rem=n%10;
			sum=sum+rem;
			pro=pro*rem;
			n=n/10;
		}
		if (sum==pro)
		{
			System.out.println("it is a SpyNumber");
		}
		else
		{
			System.out.println("it is not a SpyNumber");
		}
	}
	static void fabbinaciSeries(int a)
	{
		int n=a;
		int x=0;
		int b=1;
		int c=0;
		for (int i=1;i<=n ;i++ )
		{
			c=x+c;
			System.out.println(c);
			x=b;
			b=c;
		}
	}
	public static void main(String[] args) //Main Method
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		System.out.println("1. Palindrome Number\n2. Armstrong Number\n3. Perfect Number\n4. Strong Number\n5. Prime Number\n6. Spy Number\n7. fabbinaci Series");
		int op=sc.nextInt();
		switch (op)
		{
		case 1:
			palindrome(n);
		break;
		case 2:
			armstrongNumber(n);
		break;
		case 3:
			perfectNumbet(n);;
		break;
		case 4:
			strongNumber(n);
		break;
		case 5:
			primeNumber(n);
		break;
		case 6:
			spyNumber(n);
		break;
		case 7:
			fabbinaciSeries(n);
		break;
		}
	}
}
