import java.util.ArrayList;
import java.util.Scanner;

public class Century {

	public static void main(String[] args) {
         ArrayList<Integer> al=new ArrayList<Integer>();
         Scanner sc=new Scanner(System.in);
         int s=sc.nextInt();
         for(int i=0;i<s;i++)
         {
        	 al.add(sc.nextInt());
         }
         int c=0,c1=0;
         for(int i=0;i<s;i++)
         {
        	 if(al.get(i)>=50 && al.get(i)<100)
        		 c++;
        	 else if(al.get(i)>=100)
        		 c1++;
        		 
         }
         System.out.println(c+"\n"+c1);

	}

}
