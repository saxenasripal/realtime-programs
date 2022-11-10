/*this Program is usefull for gully criket.
here you have to give the number of overs and how many of you are playing in the each team
and on every ball you have to select what happend according to the options.
if the overs completed or all the players in the match are out then the first the match will complete.
it shows what is the score and how many foures and sixes in the match at the last time and when the overs are completed.
for every ball it shows the score and wickets.*/




import java.util.*;
class CricketScore 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the overs in a match");
		int a=scan.nextInt();
		System.out.println("How many players are there");
		int n=scan.nextInt();
		int score=0,wickets=0;
		int six=0,four=0;
		boolean flag=false;
	for(int i=1;i<=a&&wickets<n;i++) //RUNS TILL MATCH COMPLETED
		{
		for (int j=1;j<=6&&wickets<n;j++)
		 {
			System.out.println("1 single\n2 for double\n3 3runs\n4 four\n5 wide\n6 six\n7 wicket");
			int op=scan.nextInt();
			if (op==1)
			{
				score=score+1;
				System.out.println(score+"-"+wickets);
			}
			else if (op==2)
			{
				score=score+2;
				System.out.println(score+"-"+wickets);
			}
			else if (op==3)
			{
				score=score+3;
				System.out.println(score+"-"+wickets);
			}
			else if (op==4)
			{
				score=score+4;
				four+=1;
				System.out.println(score+"-"+wickets);
			}
			else if (op==5)
			{
				score=score+1;
				System.out.println(score+"-"+wickets);
			}
			else if (op==6)
			{
				six+=1;
				score=score+6;
				System.out.println(score+"-"+wickets);
			}
			else if (op==7)
			{
				wickets=wickets+1;
				if (wickets==n)
				{
					flag=true;
					break;
				}
				System.out.println(score+"-"+wickets);
			}
			else
			{
				
				System.out.println("enter a valid option");
			}
		}
		if (flag)
		{
			break;
		}
		System.out.println("After Completing the "+i+" over the score is\t"+score+"-"+wickets);
		System.out.println("After Completing the "+i+" over the sixes are\t"+six);
		System.out.println("After Completing the "+i+" over the foures are\t"+four);

	    }
    System.out.println("=========== MATCH IS OVER ===========");
	System.out.println("After Completing the Match the score is\t"+score+"-"+wickets);
	System.out.println("After Completing the Match the sixes are\t"+six);
	System.out.println("After Completing the Match the Fours are\t"+four);
	
	}
}
