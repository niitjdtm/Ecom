import java.util.Scanner;
public class loop {
	public static void main(String[] args) 
	{
		Scanner op= new Scanner(System.in);
		System.out.println("Enter the N value to sum:");
		int n=op.nextInt();
		int sum;
		int i;
		sum=0;
		
		for(i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("The sum of the n Numbers are:"+sum);
		
		
	}

}
