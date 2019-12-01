
public class PascalTriangle
{
	public static void main(String str[])
	{
		int number,i,j,k,sum;
		k=1;
		number=4;
		sum=(number/2*(1+number));
		int[][] array=new int[number][sum];
		for(i=1;i<number;i++)
		{
			for(j=1;j<=i;j++)
			{
				if((j==1)||(j==i))
				{
					array[i][j]=1;
				}
				else
				{
					array[i][j]=array[i-1][j-1]+array[i-1][j];
				}
				System.out.print(array[i][j]);
			}
		}	System.out.println();
		
	}
}

					
