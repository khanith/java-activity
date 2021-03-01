import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Overs {

	public static void main(String[] args) {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of overs: ");
		try
		{
			int size = Integer.parseInt(reader.readLine());
			int array[] = new int[size];
			System.out.println("Enter the no.of runs for each over: ");
			for(int i=0;i<size;i++)
			{
				array[i] = Integer.parseInt(reader.readLine());
				
			}
			System.out.println("Over Number: ");
			int num = Integer.parseInt(reader.readLine());
			System.out.println("Runs scored in this over :"+array[num-1]);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}