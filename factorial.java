import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
	  Scanner S=new Scanner(System.in);
	  int n=S.nextInt();
	  int i,fact=1;
	  for(i=1;i<=n;i++)
	  {
	      fact=fact*i;
	  }
	  System.out.println(fact);
	}
}
