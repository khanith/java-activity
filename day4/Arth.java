import java.util.Scanner;

public class Arth {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int run;
		float to;
		try
		{
			System.out.println("Enter the toal runs scored");
			run=sc.nextInt();
			System.out.println("Enter the toal oves faced");
			to=sc.nextFloat();
			float req= (run/to);
			System.out.print("Current Run Rate:"+"%.2f",req);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}

}
