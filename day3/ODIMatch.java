public class  ODIMatch extends Match{
	
	
    public float calcurunrate(){
        float res1=(getTarget()-getCurrscore())/(50-getCurrover());
       
        return res1;
 		}

 public int calcuballs()
 {
int res2=(int) ((50-getCurrover())*6);
return res2;
 }
 public void display(double reqrun,int balls)
 {
	 final int runs = ((getTarget())-(getCurrscore()));
	 System.out.println("Need "+runs+" runs in " +balls+" balls");
	 System.out.println("Required Runrate:"+reqrun);
 }
 
}
