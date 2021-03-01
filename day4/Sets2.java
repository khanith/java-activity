import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		TreeSet<String> s=new TreeSet<String>();
		System.out.println("Enter no.of matches");
		int si=Integer.parseInt(br.readLine());
		System.out.println("Enter players names:");
		for(int i=0;i<si;i++)
		{
			s.add(br.readLine());
		}
		System.out.println("Players names in sorted order:");
		for(String ss:s)
		System.out.println(ss);

	}

}