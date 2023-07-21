import java.util.Scanner;
class pattern
{
	public static void main(String []args)
	{
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int i,j;
		int [][]a=new int[n][n];
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=obj.nextInt();
			}
		}
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i==2&&j==2)
				{
					System.out.printf("5 ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.print("\n");
		}
	}
}