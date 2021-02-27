
import java.util.Scanner;

public class MatchMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.ODI\n2.T20\n3.Test");
		int i=sc.nextInt();
		System.out.println("Enter the Current Score");
		int cs=sc.nextInt();
		System.out.println("Enter the Current Over");
		float co=sc.nextFloat();
		System.out.println("Enter the Target Score");
		int ts=sc.nextInt();
		System.out.println("Requirements:");
		
		if(i==1)
		{
			
			ODIMatch obj = new ODIMatch();
			obj.setCurrscore(cs);
			obj.setCurrover(co);
			obj.setTarget(ts);
			float val = obj.calcurunrate();
			int balls = obj.calcuballs();
			obj.display(val, balls);
			
		}
		else if(i==2)
		{ 
			T20 ob=new T20();
			ob.setCurrscore(cs);
			ob.setCurrover(co);
			ob.setTarget(ts);
			float val = ob.calcurunrate();
			int balls = ob.calcuballs();
			ob.display(val, balls);
		}
		else
		{ 
			TestMatch o=new TestMatch();
			o.setCurrscore(cs);
			o.setCurrover(co);
			o.setTarget(ts);
			float val = o.calcurunrate();
			int balls = o.calcuballs();
			o.display(val, balls);
		}
		
		
	}

}
