public class T20 extends Match{
    public float calcurunrate(){
        float res1=(getTarget()-getCurrscore())/(20-getCurrover());
       
        return res1;
 		}

 public int calcuballs()
 {
int res2=(int) ((20-getCurrover())*6);
return res2;
 }
 public void display(double reqrun,int balls)
 {
	 final int runs = ((getTarget())-(getCurrscore()));
	 System.out.println("Need "+runs+" runs in " +balls+" balls");
	 System.out.println("Required Runrate:"+reqrun);
 }

}